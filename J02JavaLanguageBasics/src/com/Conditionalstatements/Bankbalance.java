package com.Conditionalstatements;

import java.util.Scanner;

public class Bankbalance {

	public static void main(String[] args) {
		int amt;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Amount: ");
		
		amt = scn.nextInt();
		
		 {
			if (amt < 2000) {
				System.out.println("Low balance");
			} else {
				System.out.print("Amount Available");
			}
		}
		
		}

	}