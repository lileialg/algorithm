package com.c15;

public class DivideTwoIntegers2 {
	
	public static int divide(int num1,int num2){
		
		if (num2 ==0 || num1 ==0)
			return 0;
		
		if (Math.abs(num1) < Math.abs(num2))
			return 0;
		
		if (num1 >0 && num2<0){
			return -divide(num1,-num2);
		}
		
		if (num1 <0 && num2>0)
			return -divide(-num1,num2);
		
		if (num1<0 && num2<0){
			return divide(-num1,-num2);
		}
		
		if (num1 == num2)
			return 1;
		
		int time = 1;
		
		int tmp1 = num2 ;
		
		while(num1>=tmp1 + tmp1){
			tmp1 += tmp1;
			
			time += time;
		}
		
		return time + divide(num1 - tmp1,num2);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-10, -4));
	}

}
