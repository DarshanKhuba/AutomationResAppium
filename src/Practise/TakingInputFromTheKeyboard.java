package Practise;

import java.util.Scanner;

public class TakingInputFromTheKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = 20;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num");
		
		int num = sc.nextInt();
		
		System.out.println(num + 5);

	}

}
