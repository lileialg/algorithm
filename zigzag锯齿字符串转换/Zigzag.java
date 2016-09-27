package com;

public class Zigzag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String str = "1234567890";
		
		System.out.println(zigzag(str,5));

	}
	
	
	public static String zigzag(String str,int row){
		
		StringBuilder sb = new StringBuilder();
		
		char[] cs = str.toCharArray();
		
		int k = 2;
		
		int r = 2 * (row - 1);
		
		int len = str.length();
		
		int s = 1;
		
		while(s <= len)
		{
			sb.append(cs[s - 1]);
			
			s += r;
		}
		
		
		for(int i = 2;i<=row-1;i++)
		{
			int p = i;
			
			boolean flag = true;
			
			while(p <= len){
				
				sb.append(cs[p-1]);
				
				if (flag){
					
					p = p + r - k;
					
					flag = false;
					
				}else{
					p = p + k;
					
					flag = true;
				}
				
			}
			
			k += 2;
		}
		
		
		s = row;
		
		while(s <= len)
		{
			sb.append(cs[s - 1]);
			
			s += r;
		}
		
		
		
		return sb.toString();
		
		
	}

}
