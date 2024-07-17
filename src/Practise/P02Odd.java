package Practise;

import java.util.Scanner;

public class P02Odd {
	public static void printSum(int n) {
		int sum = 0;
		//int = n;
		 ///    
		for (int i = 1; i<=n; i++){
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		//0printSum(n);
	}

}
