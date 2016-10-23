package chapter3;

import java.util.ArrayList;
import java.util.List;

public class JumpGame22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sublist =new int[1];
		
		List<int[]> list = new ArrayList<int[]>();
		
		
		int[] array = new int[]{2,3,1,1,4};
		
		sublist[0] = 0;
		
		jumpGame(array,0,sublist,list);
		
		
		for(int[] a : list){
			for(int v : a)
				System.out.print(v+",");
			
			System.out.println();
		}
		
	}
	
	
	public static void jumpGame(int[] array,int pos,int[] sublist,List<int[]> list){
		
		if (pos <array.length){
			if (pos == array.length -1){
				list.add(sublist);
			}else{
				int value = array[pos];
				
				for(int i=1;i<=value;i++){
					int[] newlist = new int[sublist.length+1];
					
					for(int j=0;j<sublist.length;j++)
						newlist[j] = sublist[j];
					
					newlist[sublist.length] = pos+i;
					
					jumpGame(array,pos+i,newlist,list);
				}
			}
		}
		
	}

}
