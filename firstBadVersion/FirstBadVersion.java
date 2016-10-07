package chapter3;

import java.util.Random;

public class FirstBadVersion {
	
	private static int[] array;
	
	private static int badVersion;

	public static void main(String[] args) {
		array = new int[50];
		
		for(int i = 1;i<=array.length;i++)
		{
			array[i-1] = i;
		}
		
		Random rand = new Random();
		
		badVersion = rand.nextInt(50);
		
		System.out.println(badVersion+","+firstBadVersion(0,array.length-1));
	}
	
	
	
	public static int firstBadVersion(int left,int right)
	{
		if (array == null || array.length ==0)
			return -1;
		
		if (left == right){
			if (isBadVersion(left))
				return left;
			else
				return left + 1;
		}
		
		int mid = (left + right) / 2;
		
		if (isBadVersion(mid)){
			
			right = mid;
			
			
		}else{
			left = mid + 1;
		}
		
		return firstBadVersion(left,right);
		
	}
	
	
	public static boolean isBadVersion(int n){
		if (n >= badVersion)
			return true;
		else
			return false;
	}

}
