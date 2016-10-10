package chapter3;

import java.util.Set;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		

		System.out.println(longestSubstringWithoutRepeatingCharacter("sadfasbcdevfabc"));
	}
	
	
	
	public static int longestSubstringWithoutRepeatingCharacter(String str)
	{
		if (str == null || str.length() ==0)
			return 0;
		
		int maxLength = 0;
		
		char[] cs = str.toCharArray();
		
		Set<Character> set = new TreeSet<Character>();
		
		for(char c:cs)
		{
			if (set.contains(c)){
				if (set.size() > maxLength)
				{
					maxLength = set.size();
				}
				
				set.clear();
				
				set.add(c);
			}else{
				set.add(c);
			}
		}
		
		return maxLength>set.size()?maxLength:set.size();
	}

}
