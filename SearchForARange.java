package threads;

public class SearchForARange {

	public static int search(int[] A,int target,int start,int end){
		
		if (start == end){
			if (A[start] == target)
				return start;
			else
				return -1;
		}else if (start > end )
		{
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if (A[mid] < target){
			return search(A,target,mid+1,end);
		}else if (A[mid] > target){
			return search(A,target,start,mid-1);
		}else{
			return mid;
		}
		
	}
	
	public static int[]	searchForARange(int[] A,int target){
		if (A == null)
			return new int[]{-1,-1};
		
		int pos = search(A,target,0,A.length -1);
		
		if (pos != -1){
			int start = pos;
			
			while(start >=1 && A[start-1] == target){
					start--;
			}
			
			int end = pos;
			
			while(end <A.length -1 && A[end+1] == target)
				end++;
			
			return new int[]{start,end};
		}else{
			return new int[]{-1,-1};
		}
	}
	
	
	public static void main(String[] args) {
		int[] A = new int[]	{5,7,7,8,8,10};
		
		System.out.println(searchForARange(A,82)[0] +","+searchForARange(A,82)[1]);
	}
	
}
