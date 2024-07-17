package Practise;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number of multiplication table");
		int number = sc.nextInt();
		System.out.println("Multiplication table for " + number + ":");
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n",number, i, number * i);		
		}
	
	}

}
