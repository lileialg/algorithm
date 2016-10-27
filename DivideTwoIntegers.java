package com.c15;

public class DivideTwoIntegers {
	
	public static int divideTwoInteger(int num1,int num2){
		
		if (num2 ==0 || num1 ==0)
			return 0;
		
		if (Math.abs(num1) < Math.abs(num2))
			return 0;
		
		if (num1 >0 && num2<0){
			return -divideTwoInteger(num1,-num2);
		}
		
		if (num1 <0 && num2>0)
			return -divideTwoInteger(-num1,num2);
		
		int time = 1;
		
		int tmp1 = num2 + num2;
		
		while(num1 - tmp1>=0){
			tmp1 += num2;
			time++;
		}
		
		return time;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(divideTwoInteger(-10, 4));
		
	}

}
