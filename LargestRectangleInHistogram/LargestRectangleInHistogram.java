package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {

	static class Rect {
		int height;

		int width = 1;

		public Rect(int height) {
			this.height = height;
		}
	}

	public static int largestRectangle(int[] heights) {
		int max = 0;

		heights = Arrays.copyOf(heights, heights.length + 1);

		Stack<Rect> stack = new Stack<Rect>();

		stack.push(new Rect(heights[0]));

		loop: for (int i = 0; i < heights.length; i++) {

			int h = heights[i];
			
			int w = 1;
			
			Rect r = new Rect(h);

			while (true) {

				
				
				if (stack.isEmpty() || h > stack.peek().height) {

					r.width = w + 1;
					
					stack.push(r);
					
					continue loop;
				}
				
				Rect rect = stack.pop();
				
				max = Math.max(max, rect.height * w);
				
				w++;
				
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] heights = new int[]{2,1,5,6,2,3};
		
		System.out.println(largestRectangle(heights));
	}

}
