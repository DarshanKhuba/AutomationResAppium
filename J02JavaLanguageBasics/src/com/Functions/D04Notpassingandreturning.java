package com.Functions;

import java.util.Scanner;

public class D04Notpassingandreturning {
	public static int findsquare()
	{
		int no;
		Scanner scn = new Scanner(System.in);
				System.out.print("Enter no: ");
		no = scn.nextInt();
		//int ans = no * no;
		//return ans;
		
		return no * no;
		
	}

	public static void main(String[] args) {
		int sq = findsquare();
		System.out.println("Square: " + sq);

	}

}
