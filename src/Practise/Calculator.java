package Practise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number (a): ");
		double a = sc.nextDouble();
		System.out.println("Enter the second number (b): ");
		double b = sc.nextDouble();
		
		System.out.println("Choose an operation:");
		System.out.println("1: + Addition)");
		System.out.println("2: + Substraction)");
		System.out.println("3: + Multiplication)");
		System.out.println("4: + Division");
		System.out.println("5: + (Modulus of remainder)");
		
		System.out.println("Enter the number corresponding to the operation: ");
		int operation = sc.nextInt();
		
		
		double result;
		switch (operation) {
		case 1:
			result = a + b;
			System.out.println(a + "+" + b + " = " + result);
			break;
		case 2:
			result = a - b;
			System.out.println(a + "-" + b + " = " + result);
			break;
		case 3:
			result = a * b;
			System.out.println(a + "*" + b + " = " + result);
			break;
		case 4:
			if (b != 0) {
				result = a / b;
				System.out.println(a+ " / " + b + " = " + result);
			}else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		case 5:
			if (b != 0) {
				result = a % b;
				System.out.println(a+ " % " + b + " = " + result);
			}else {
				System.out.println("Error: Modulo by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid operation Choice please run the program again");
			break;
			
		
			
		}

	}

}
