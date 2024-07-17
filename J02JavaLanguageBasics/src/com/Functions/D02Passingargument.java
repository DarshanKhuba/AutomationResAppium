package com.Functions;

public class D02Passingargument {
	public static void calculateaddition(int no1, int no2)
	{
		int sum = no1 + no2;
		System.out.println("Addition: " + sum);
	}
	public static void main(String [] args) {
		calculateaddition(33, 30);
		int no1 = 60, no2 = 40;
		calculateaddition(no1, no2);
	}
 
}
