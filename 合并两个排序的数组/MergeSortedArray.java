package threads;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		
		for(int i=0;i<5;i++){
			A[i] = i * 2 + 1;
		}
		
		int m = 5;
		
		int[] B = new int[5];
		
		for(int i=0;i<5;i++){
			B[i] = i * 2 + 2;
		}
		
		int n = B.length;
		
		mergeSortedArray(A, B, m, n);
		
		for(int v:A)
			System.out.print(v+",");

	}

	public static void mergeSortedArray(int[] A, int[] B, int m, int n) {

		int p = m + n - 1;

		m = m - 1;

		n = n - 1;

		while (p >= 0) {
			if (m >= 0 && n >= 0) {
				if (A[m] >= B[n]) {
					A[p] = A[m];
					m--;
					p--;
				} else {
					A[p] = B[n];
					n--;
					p--;
				}
			}else if (n >=0 && m<=0){
				A[p] = B[n];
				n--;
				p--;
			}else{
				break;
			}
		}
	}

}
