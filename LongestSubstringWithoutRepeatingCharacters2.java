package chapter3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestSubstring("abcabcbb".toCharArray()));
	}
	
	
	
	public static String longestSubstring(char[] cs){
		
		if (cs == null || cs.length == 0)
			return null;
		
		else{
			
			int start = 0;
			int end = 0;
			
			
			for(int i=0;i<cs.length;){
				
				Map<Character,Integer> map = new HashMap<Character,Integer>();
				
				int e = i;
				
				
				while(e<cs.length){
					if (!map.keySet().contains(cs[e])){
						map.put(cs[e], e);
						e++;
					}else{
						break;
					}
					
				}
				
				if (e -1- i > end - start){
					start = i;
					end = e -1 ;
				}
				
				
				int maxPos = i + 1;
				
				while(e<cs.length && map.keySet().contains(cs[e])){
					
					if (maxPos < map.get(cs[e])){
						maxPos = map.get(cs[e]);
					}
					
					e++;
					
				}
				
				i = maxPos+1;
			}
			
			char[] newCs = new char[end - start + 1];
			
			for(int i=start;i<=end;i++){
				newCs[i-start] = cs[i];
			}
			
			return new String(newCs);
			
			
		}
		
	}

}
