package com.bitsetapp;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

public class BitSetTopK {

	public static void init(BitSet bs, int num) {
		Random rand = new Random();

		while (num > 0) {
			bs.set(rand.nextInt(5000));

			num--;
		}
	}

	public static List<Integer> getTopK(BitSet bs, int k) {

		int size = bs.size();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = size; i >= 0 && k > 0; i--) {
			if (bs.get(i)) {
				list.add(i);
				k--;
			}
		}

		return list;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BitSet bs = new BitSet();
		
		init(bs,500000);
		
		List<Integer> list = getTopK(bs,40);
		
		for(int v: list)
			System.out.print(v+",");
	}

}
