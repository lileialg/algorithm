package com;

import org.junit.Assert;



public class PalindromInteger {


	public static void main(String[] args) {

		
		int num = 4321234;
		
		int len = getLengthInt(num);
		
		Assert.assertEquals(isPalindrom(num, len), true);
	}
	
	
	
	public static int getLengthInt(int num){
		if (num<0)
			throw new IllegalArgumentException();
		
		int n = 1;
		
		while(num / (int)Math.pow(10, n)!=0)
			n++;
		
		return n;
	}
	
	public static int getPositionNum(int num,int len,int p)
	{
		if (num<0)
			throw new IllegalArgumentException();
		
		int n1 = (int) Math.pow(10, len - p + 1);
		
		int n2 = num / n1;
		
		int n3 = n2 * n1;
		
		int n4 = num - n3;
		
		int n5 = n4 / (int)Math.pow(10,len -p);
		
		return n5;
	}
	
	public static boolean isPalindrom(int num,int len){
		
		if (num<0)
			throw new IllegalArgumentException();
		
		int left = 1;
		
		int right = len;
		
		while(left <= right){
			if (getPositionNum(num, len, left) != getPositionNum(num, len, right))
				return false;
			
			left++;
			
			right--;
		}
		
		return true;
		
	}

}
