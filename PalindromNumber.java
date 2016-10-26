package com.c15;

public class PalindromNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(palindromNumber(-124321));
	}

	public static boolean palindromNumber(int value) {

		int len = 1;

		int num = 10;

		while (value / num != 0) {
			num *= 10;
			len++;
		}

		if (len == 1)
			return true;

		int left = len;

		int right = 1;

		while (left >= right) {
			if (getPositionValue(value,left) != getPositionValue(value,right))
				return false;
			
			left--;
			
			right++;
		}
		
		return true;

	}

	public static int getPositionValue(int value, int p) {

		int tmp = (int) Math.pow(10, p);

		int tmp2 = value / tmp;
		
		if (tmp2 == 0){
			
			return Math.abs(value * 10 / tmp);
		}

		tmp2 = tmp2 * tmp;
		
		int result =  Math.abs(value - tmp2) *10 / tmp;

		return result;

	}

}
