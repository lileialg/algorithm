package a2;

public class NPower {

	public static void main(String[] args) {
		System.out.println(npower(2,10));
		
		
	}

	public static int npower(int n, int k) {
		
		if (k == 1){
			return n;
		}

		if (k % 2 == 0)
			return npower(n * n, k / 2);
		else
			return npower(n * n, k / 2) * n;

	}

}
