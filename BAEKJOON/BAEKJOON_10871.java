package Baekjoon;

import java.util.Scanner;

public class BAEKJOON_10871 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		 
		int a = num.nextInt();
		int b = num.nextInt();
		int arr[] = new int[a];
        
		for (int i = 0; i < a; i++) {
			arr[i] = num.nextInt();
		}
 
		num.close();
        
		for (int i = 0; i < a; i++) {
			if (arr[i] < b) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
