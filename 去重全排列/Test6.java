package s2;

import java.util.HashSet;
import java.util.Set;

public class Test6 {
	
	public static Set<String> set = new HashSet<String>();

	public static void main(String[] args) {

		if (args.length > 0) {

			char[] cs = args[0].toCharArray();

			int len = cs.length;

			pailie(cs, 0, len);
		}
	}

	public static void pailie(char[] cs, int n, int len) {

		if ((n + 1) == len &&(!isContain(cs))) {
			for (char c : cs) {
				System.out.print(c + ",");
			}
			System.out.println();
			String str = ""+cs[0];
			
			for(int i=1;i<cs.length;i++){
				str += cs[i];
			}
			set.add(str);
		} else {

			for (int i = n; i < len; i++) {
				if (i == n || cs[i] != cs[n]) {
					switchData(i, n, cs);
//				}

				pailie(cs, n + 1, len);
//				if (i == n || cs[i] != cs[n]) {
					switchData(i, n, cs);
				}

			}

		}

	}

	public static void switchData(int i, int n, char[] cs) {
		char tmp = cs[i];
		cs[i] = cs[n];
		cs[n] = tmp;
	}
	
	public static boolean isContain(char[] cs){
		
		String str = ""+cs[0];
		
		for(int i=1;i<cs.length;i++){
			str += cs[i];
		}
		
		if (set.contains(str)){
			return true;
		}else{
			return false;
		}
		
	}

}
