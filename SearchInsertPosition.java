package threads;

public class SearchInsertPosition {
	
	public static int search(int[] A,int target,int start,int end){
		
		if (start == end){
			if (A[start] < target) return start +1;
			else return start;
		}else if (start > end )
		{
			return 0;
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

	public static void main(String[] args) {
	
		int[] A = new int[]{1,3,5,6};
		
		System.out.println(search(A,0,0,A.length-1));
	}

}
