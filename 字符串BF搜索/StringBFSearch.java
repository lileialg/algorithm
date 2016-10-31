import java.util.ArrayList;
import java.util.List;

public class StringBFSearch {

	public static List<Integer> bf(String text, String pattern) {

		List<Integer> list = new ArrayList<Integer>();

		char[] csText = text.toCharArray();

		char[] csPattern = pattern.toCharArray();

		int lenText = csText.length;

		int lenPattern = csPattern.length;

		int i = 0;
		int j = 0;

		while (i < lenText) {

			if (csText[i] == csPattern[j]) {

				if (j == lenPattern - 1) {
					list.add(i - lenPattern + 1);
					i++;
					j=0;
				} else {

					i++;
					j++;
				}

			} else {
				i++;
				j = 0;
			}

		}

		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "ABCDEFGABCHI";

		String pattern = "EFG";

		List<Integer> list = bf(text, pattern);

		for (int v : list)
			System.out.print(v + ",");
	}

}
