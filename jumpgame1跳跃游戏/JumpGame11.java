package chapter3;

public class JumpGame11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] { 2, 3, 1, 1, 0, 4 };

		System.out.println(jumpGame(A));
	}

	public static boolean jumpGame(int[] A) {

		int maxStep = 0;

		for (int i = 0; i < A.length; i++) {

			if (i > maxStep) {
				return false;
			} else {
				if (i + A[i] >= A.length) {
					return true;
				} else {
					maxStep = Math.max(maxStep, i + A[i]);
				}
			}

		}

		return false;
	}

}
