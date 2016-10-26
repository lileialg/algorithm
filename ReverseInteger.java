package com.c15;

public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int value = 1234567899;
	
		
		System.out.println(reverse(value));
	}
	
	
	public static int reverse(int v){
		
		if (v == Integer.MIN_VALUE) return 0;
		
		if (v <0) return -reverse(-v);
		
		int newValue = 0;
		
		while(v>0){
			
			int tmp = v / 10;
			
			tmp = tmp * 10;
			
			int v1 = v - tmp;
			
			if (newValue>(Integer.MAX_VALUE-v1)/10)
				return 0;
			
			newValue = newValue * 10 + v1;
			
			v = v / 10;
			
		}
		
		return newValue;
		
	}

}
