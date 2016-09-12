package s2;

public class Test5 {

	public static void main(String[] args) {

		if (args.length > 0) {

			char[] cs = args[0].toCharArray();

			int len = cs.length;

			pailie(cs, 0, len);
		}
	}

	public static void pailie(char[] cs, int n, int len) {

		if ((n + 1) == len) {
			for (char c : cs) {
				System.out.print(c + ",");
			}
			System.out.println();
		} else {

			for (int i = n; i < len; i++) {
				switchData(i, n, cs);

				pailie(cs, n + 1, len);

				switchData(i, n, cs);

			}

		}

	}

	public static void switchData(int i, int n, char[] cs) {
		char tmp = cs[i];
		cs[i] = cs[n];
		cs[n] = tmp;
	}

}
