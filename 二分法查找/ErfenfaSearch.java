package a2;

import java.util.Random;

public class ErfenfaSearch {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		init(array);
		
		
		for(int v : array)
			System.out.print(v+",");
		
		
		Random rand = new Random();
		
		int value = array[rand.nextInt(9)]
				;
		
		System.out.println("\n"+value);
		
		System.out.println(erfenfa(value+1,array,0,9));
		
	}
	
	public static void init(int[] array){
		
		Random rand = new Random();
		
		for(int i=0;i<array.length;i++){
			
			int value = rand.nextInt(100);
			
			int j = i-1;
			
			while(j >=0 && array[j]>value ){
				array[j+1] = array[j];
				
				j--;
			}
			
			array[j+1] = value;
			
		}
	}
	
	
	public static int erfenfa(int value,int[] array,int left,int right)
	{
		if (array == null || array.length == 0)
		{
			return -1;
		}
		
		
		while(left <= right){
			
			int mid = (left + right) / 2;
			
			if (array[mid] == value){
				return mid;
			}else if (array[mid] < value){
				left = mid + 1;
				
			}else{
				right = mid -1;
			}
			
		}
		
		return -1;
	}

}
