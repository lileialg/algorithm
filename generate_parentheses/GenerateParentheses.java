package com;

public class GenerateParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		display("",4,4);
	}
	
	
	public static void display(String str,int left,int right){
		if (left ==0 && right ==0){
			System.out.println(str);
		}else{
		 
			for(int i=left;i>0;i--){
				str = str +"(";
				String str1 = str;
				for(int j=right;j>=i;j--){
					str1 +=")";
					
					display(str1,i-1,j-1);
				}
				
			}
			
		}
	}

}
