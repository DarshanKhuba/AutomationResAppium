package Practise;

import java.util.Scanner;

public class HandlinGException {
	public static void main (String[] args)
	{
		System.out.println("Game starts---->");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Score==");
		int num = sc.nextInt();
		try {
		System.out.println(100/num);
		}
		catch(ArithmeticException  e)
		{
			System.out.println("Invalid Data...");
		
		}
		
		System.out.println("Game Over");
		System.out.println("Exit Game!!");
	}

}
