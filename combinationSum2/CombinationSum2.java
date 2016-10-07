package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CombinationSum2 {

	public static void main(String[] args) {

		int[] array = new int[] { 10, 1, 2, 7, 6, 1, 5 };

		Arrays.sort(array);
		
		Set<String> set = new HashSet<String>();

		fun(array, 10, 0, null,set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public static void fun(int[] array, int target, int pos, List<Integer> list,Set<String> set) {

		for (int i = pos; i < array.length; i++) {

			if (array[i] < target) {
				List<Integer> list2 = new ArrayList<Integer>();

				if (list != null){
					for(int v: list)
						list2.add(v);
				}

				list2.add(array[i]);
				fun(array, target - array[i], i + 1, list2,set);
			} else if (array[i] == target) {
				List<Integer> list2 = new ArrayList<Integer>();

				if (list != null){
					for(int v: list)
						list2.add(v);
				}

				list2.add(array[i]);
				
				StringBuilder sb = new StringBuilder();
				
				for (int v : list2) {
					sb.append(String.valueOf(v)+",");

				}
				
				set.add(sb.toString());
			}
		}

	}
}
