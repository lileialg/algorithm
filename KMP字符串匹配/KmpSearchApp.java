import java.util.ArrayList;
import java.util.List;

public class KmpSearchApp {
	
	public static List<Integer> kmp(String text,String pattern){
		
		List<Integer> list = new ArrayList<Integer>();
		
		int i=0;
		int j=0;
		int[] array = prefixSuffixCompute(pattern);
		
		int lengthText = text.length();
		int lengthPattern = pattern.length();
		
		while(i<lengthText){
			if(text.charAt(i) == pattern.charAt(j)){
				i++;
				j++;
			}
			
			if (j == lengthPattern-1){
				list.add(i-lengthPattern+1);
				i++;
				j=array[j-1];
			}else if (i <lengthText){
				if (text.charAt(i) != pattern.charAt(j)){
					if (j !=0)
						j = array[j-1];
					else
						i++;
				}
			}
			
		}
		
		return list;
	}
	
	public static int[] prefixSuffixCompute(String pattern){
		int [] array = new int[pattern.length()];
		
		int len = 0;
		
		int i= 1;
		
		int length = pattern.length();
		
		while(i<length){
			if (array[i] == array[len]){
				len++;
				array[i] = len;
				i++;
			}else{
				if (len >0 ){
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

		
		String text = "ABCDEFGABCHI";
		
		String pattern = "EFG";
		
		List<Integer> list = kmp(text,pattern);
		
		for(int v:list)
			System.out.print(v+",");
		
	}

}
