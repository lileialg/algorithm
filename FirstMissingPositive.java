package threads;

public class FirstMissingPositive {
	
	 public static int firstMissingPositive(int[] A) {

		 int len = A.length;
		 
		 int result = -1;
		 
		 loop:
		 for(int i=1;i<=len;i++){
			 for(int j=0;j<A.length;j++){
				 if (A[j] == i){
					 continue loop;
				 }
			 }
			 
			 result = i;
			 
			 break;
		 }
		 
		 return result;
	 }
	 
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[]{0,1,2};
		
		System.out.println(firstMissingPositive(a));
	}

}
