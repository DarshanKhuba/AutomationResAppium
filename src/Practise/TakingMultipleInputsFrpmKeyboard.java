package Practise;

import java.util.Scanner;

public class TakingMultipleInputsFrpmKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter secoond Number: ");
		int num2=sc.nextInt();
		
		System.out.println("Addition of two numbers: " + (num1+num2));
	}

}
