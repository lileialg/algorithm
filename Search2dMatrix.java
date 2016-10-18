package threads;

public class Search2dMatrix {
	
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
	
	public static int getRow(int[][] matrix,int target,int start,int end){
		
		
		if (start == end){
			if (matrix[start][0] <= target && matrix[start][matrix[start].length-1] >= target)
				return start;
			else
				return -1;
		}else if (start > end)
			return -1;
		
		
		int mid = (start + end) /2;
		
		if (matrix[mid][0] <= target && matrix[mid][matrix[mid].length-1] >= target)
			return mid;
		else if (matrix[mid][0] > target){
			return getRow(matrix,target,start,mid -1);
		}else{
			return getRow(matrix,target,mid+1,end);
		}
		
	}
	
	public static boolean search2dMatrix(int[][] matrix,int target){
		
		if (matrix == null) return false;
		
		int row = getRow(matrix,target,0,matrix.length-1);
		
		if (row>=0){
			int pos = search(matrix[row],target,0,matrix[row].length-1);
			
			if (pos >=0) return true;
			else return false;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
