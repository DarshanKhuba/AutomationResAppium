package com.Conditionalstatements;

import java.util.Scanner;

public class D03Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, reminder;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		no = scn.nextInt();
		
		reminder = no % 2;
		
		if(reminder == 0)
		{
			System.out.println("Number is Even");
			
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
