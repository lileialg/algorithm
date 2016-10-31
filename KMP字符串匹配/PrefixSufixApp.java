
public class PrefixSufixApp {
	
	public static int[] calFix(String str){
		char[] cs = str.toCharArray();
		
		int[] array = new int[cs.length];
		
		int len = 0;
		
		int i=1;
		
		int m = str.length();
		
		while(i<m){
			
			if (cs[i] == cs[len]){
				len++;
				array[i]=len;
				i++;
			}else{
				if (len >0){
					len = array[len-1];
				}else{
					i++;
				}
			}
			
			
		}
		
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
