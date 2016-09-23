package com;

public class Test8 {

	public static void main(String[] args) {

		char[] array = ")))()())()()()())))".toCharArray();
		
		int start = 0;
		
		int status = 0;
		
		int maxStart = 0;
		
		int maxEnd = 0;
		
		boolean isStart = false;
		
		for(int i=0;i<array.length;i++){
			
			
			char c = array[i];
			
			if (c ==')' && !isStart){
				continue;
			}
			
			
			
			if (c == '('){
				isStart = true;
				
				if (start == 0){
					start = i;
				}
				
				status++;
			}else{
				if (status >=0){
					status--;
					
					if (status == -1){
						if (i - start - 1 > maxEnd - maxStart){
							maxStart = start;
							maxEnd = i-1;
							
							start = i + 1;
							
							status = 0;
						}
					}
				}else{
					start = i+ 1;
				}
			}
			
		}
		
		
		if (status > 0){
			char[] sarray = new char[array.length - start ];
			
			int num = 0;
			
			for(int i=array.length-1;i>=start;i--){
				sarray[num++] = array[i];
			}
			
			int sstart = 0;
			
			int sstatus = 0;
			
			int smaxStart = 0;
			
			int smaxEnd = 0;
			
			boolean sisStart = false;
			
			for(int i=0;i<sarray.length;i++){
				
				char c = sarray[i];
				
				if ( c == '(' && !isStart){
					continue;
				}
				
				
				
				if (c == ')'){
					if (sstart == 0){
						sstart = i;
					}
					
					isStart = true;
					sstatus++;
				}else{
					if (sstatus >=0){
						sstatus--;
						
						if (sstatus == -1){
							if (i - sstart -1 > smaxEnd - smaxStart){
								smaxStart = sstart;
								smaxEnd = i -1;
								
								sstart = i + 1;
								
								sstatus = 0;
							}
						}
					}else{
						sstart = i+ 1;
					}
				}
				
			}
			
			if (smaxEnd - smaxStart > maxEnd - maxStart){
				maxEnd = array.length - smaxStart - 1;
				maxStart = array.length - smaxEnd - 1;
			}
		}else{
			if (array.length -1 - start > maxEnd - maxStart){
				maxEnd = array.length - 1;
				maxStart = start;
			}
		}
		
		
		System.out.println(maxStart +"-" + maxEnd);
	}

}
