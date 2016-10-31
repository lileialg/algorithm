
public class SingleNumber2 {

	public static int singleNumber(int[] array) {
		int[] result = new int[32];

		for (int v : array) {
			String bin = Integer.toBinaryString(v);

			int len = bin.length();

			for (int i = 0; i < len; i++) {
				char c = bin.charAt(i);

				if (c == '1') {
					result[32 - len + i] += 1;
				}
			}
		}

		int value = 0;

		for (int i = 31; i > 0; i--) {
			value += result[i] % 3 * Math.pow(2, 32 - i - 1);
		}
		if (result[0] == 0)

			return value;

		else
			return value - Integer.MAX_VALUE -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(singleNumber(new int[]{1,1,1,2,2,2,-3}));

	}

}
