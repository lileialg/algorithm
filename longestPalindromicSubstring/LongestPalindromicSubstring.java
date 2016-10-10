package com;

import org.junit.Assert;


public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Assert.assertEquals(longestPalindromicSubstring("avadfadsa3abcddcba3b"), "3abcddcba3");
		
	}
	
	public static String longestPalindromicSubstring(String str)
	{
		if (str == null || str.length() ==0)
			throw new IllegalArgumentException();
		
		char[] cs = str.toCharArray();
		
		int start = 0,end = 0;
		
		for(int i=0;i<cs.length-1;i++){
			int right = cs.length - 1;
			
			while(!isPalindrom(cs, i, right))
				right--;
			
			if (right - i > end - start ){
				start = i;
				end = right;
				
			}

			
			
		}
		
		return str.substring(start, end+1);
	}
	
	
	public static boolean isPalindrom(char[] cs,int left,int right)
	{
		while(left <= right && cs[left]== cs[right])
		{
			left++;
			right--;
		}
		
		if (left >= right)
			return true;
		else
			return false;
	}

}
