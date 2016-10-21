package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestoreIpAddresses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> list = new ArrayList<List<String>>();

		restoreIpAddresses(1, 0, "25525511135", new ArrayList<String>(), list);
		
		for(List<String> subList:list){
			for(String s:subList)
				System.out.print(s+".");
			
			System.out.println();
		}
	}

	public static void restoreIpAddresses(int num, int pos, String ip,
			List<String> subList, List<List<String>> list) {
		if (num == 4) {
			if (Long.parseLong(ip.substring(pos)) <= 255l) {
				List<String> newList = new ArrayList<String>();
				for(String s:subList)
					newList.add(s);
				newList.add(ip.substring(pos));
				list.add(newList);
			}
		} else {
			for (int i = pos; i < (pos + 3) && i < ip.length(); i++) {
				String str = ip.substring(pos, i + 1);
				if (Integer.parseInt(str) <= 255) {
					List<String> newList = new ArrayList<String>();
					for(String s:subList)
						newList.add(s);
					newList.add(str);
					restoreIpAddresses(num + 1, i + 1, ip, newList, list);
				}
			}
		}
	}

}
