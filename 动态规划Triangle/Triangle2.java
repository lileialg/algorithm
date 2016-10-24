package com;

public class Triangle2 {

	static int triangle(int[][] array) {

		int[] s = new int[] { array[0][0] };

		for (int i = 1; i < array.length; i++) {

			int[] tmp = array[i];

			int[] ns = new int[tmp.length];

			if (s.length > 1)

				ns[0] = tmp[0] + Math.min(s[0], s[1]);

			else
				ns[0] = tmp[0] + s[0];

			for (int j = 1; j < tmp.length - 1; j++) {

				ns[j] = tmp[j] + Math.min(s[j - 1], s[j]);

			}

			ns[tmp.length - 1] = tmp[tmp.length - 1] + s[s.length - 1];

			s = ns;

		}
		
		int minValue = Integer.MAX_VALUE;
		
		for(int v:s){
			if (minValue >v)
				minValue = v;
		}
		
		return minValue;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[][]{{2},{3,4},{6,5,7},{4,1,8,3}};
		
		System.out.println(triangle(array));
	}

}
