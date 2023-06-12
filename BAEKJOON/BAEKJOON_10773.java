package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class BAEKJOON_10773 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int k = num.nextInt();
		int sum = 0;
		for (int i = 0; i < k; i++) {
			int j = num.nextInt();
			if (j == 0) {
				stack.pop();
			} else {
				stack.push(j);
			}
		}
		for (int s : stack) {
			sum += s;
		}

		System.out.println(sum);
	}

}
