package com;

public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[]{1,2,3,4,5};
		
		show(array,0,3,"");
	}
	
	
	public static void show(int[] array,int num1,int num2,String str){
		
		int num3 = num2;
		
		num3--;
		
		for(int i=num1;i<array.length;i++){
			
			
			String str2 = str +"," + i;
			
			
			
			if (num3 > 0){
				show(array,i+1,num3,str2);
			}else{
				System.out.println(str2);
			}
			
		}
		
	}

}
