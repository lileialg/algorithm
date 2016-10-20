package threads;

import java.util.ArrayList;
import java.util.List;

public class NQueens1 {

	public static void main(String[] args) {
		
//		List<int[]> list = new ArrayList<int[]>();
//		
//		list.add(new int[]{4,1});
//		list.add(new int[]{7,2});
//		list.add(new int[]{3,3});
//		
//		System.out.println(isOk(list,8,4));
		
		List<List<int[]>> list = new ArrayList<List<int[]>>();

		nQueens(8,1,new ArrayList<int[]>(),list);
		
		for(List<int[]> sub:list){
			for(int[] xy:sub){
				System.out.print(xy[0]+","+xy[1]+"   ");
			}
			System.out.println();
		}
	}
	
	
	public static void nQueens(int n,int row,List<int[]> subList,List<List<int[]>> list){
		if (row > n)
			list.add(subList);
		else{
			
			for(int i=1;i<=n;i++){
				if (isOk(subList,i,row)){
					List<int[]> newList = new ArrayList<int[]>();
					
					for(int[] xy:subList){
						newList.add(xy);
					}
					
					
					newList.add(new int[]{i,row});
					
					nQueens(n,row+1,newList,list);
				}
			}
			
		}
	}

	public static boolean isOk(List<int[]> list, int x, int y) {

		for (int[] xy : list) {
			if (xy[0] == x || xy[1] == y || ((double)(x - xy[0]) / (double)(y - xy[1])) == 1 || ((double)(x - xy[0]) / (double)(y - xy[1])) == -1)
				return false;
		}

		return true;

	}

}
