package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordLadder {
	
	public static void wordLadder(String start,String end,Set<String> contains,Set<String> dic){
		
		char[] cs = start.toCharArray();
		outer:
		for(int i=0;i<cs.length;i++){
			char c1 = cs[i];
			
			for(char c2 = 'a';c2<='z';c2++){
				String newWord = generateNewWord(cs, i, c2);
				
				if (c1 != c2 && isOk(newWord,contains,dic)){
					if (newWord.equals(end)){
						//Ý”³ö
						Iterator<String> it = contains.iterator();
						
						while(it.hasNext())
							System.out.print(it.next()+"->");
						System.out.println(end);
						break outer;
					}else{
						Set<String> newContains = copySet(contains);
						newContains.add(newWord);
						wordLadder(newWord,end,newContains,dic);
					}
				}
			}
		}
		
	}
	
	public static Set<String> copySet(Set<String> contains){
		Set<String> set = new HashSet<String>();
		
		Iterator<String> it = contains.iterator();
		
		while(it.hasNext())
			set.add(it.next());
		
		return set;
	}
	
	
	public static String generateNewWord(char[] cs,int p,char c){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<cs.length;i++){
			if (i!=p)
				sb.append(cs[i]);
			else
				sb.append(c);
		}
		
		return sb.toString();
	}
	
	public static boolean isOk(String newWord,Set<String> contains,Set<String> dic){
		
		
		if (!contains.contains(newWord) && dic.contains(newWord))
			return true;
		else
			return false;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String start = "hit";
		
		String end = "cog";
		
		Set<String> dic = new HashSet<String>();
		
		dic.add("hot");
		
		dic.add("dot");
		
		dic.add("dog");
		
		dic.add("lot");
		
		dic.add("log");
		
		dic.add("cog");
		
		Set<String> contains = new HashSet<String>();
		
		contains.add(start);
		
		wordLadder(start,end,contains,dic);
	
	}

}
