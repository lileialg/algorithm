package com.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static int evaluateReversePolishNotation(String[] array) {

		Stack<String> stack = new Stack<String>();

		int result = 0;

		boolean flag = false;

		for (String s : array) {

			if (s.matches("^[0-9]+$")) {
				stack.push(s);
			} else {
				if (flag) {

					char c = s.charAt(0);

					switch (c) {
					case '+':
						result = Integer.parseInt(stack.pop()) + result;
						break;
					case '-':
						result = Integer.parseInt(stack.pop()) - result;
						break;

					case '*':
						result = Integer.parseInt(stack.pop()) * result;
						break;
					default:
						result = Integer.parseInt(stack.pop()) / result;
						break;
					}

				} else {
					char c = s.charAt(0);
					flag = true;

					int second = Integer.parseInt(stack.pop());
					int first = Integer.parseInt(stack.pop());

					switch (c) {
					case '+':
						result = first + second;
						break;
					case '-':
						result = first - second;
						break;

					case '*':
						result = first * second;
						break;
					default:
						result = first / second;

						break;
					}
				}

			}

		}

		return result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evaluateReversePolishNotation(new String[] { "4",
				"13", "5", "/", "+" }));

		System.out.println(evaluateReversePolishNotation(new String[] { "2",
				"1", "+", "3", "*" }));
	}

}
