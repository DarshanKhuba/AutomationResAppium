package Practise;

import java.util.Scanner;

public class Checingnumberpositivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:--");
		num = sc.nextInt();
		{
			if(num>0) {
				System.out.println("Hey man...Its POSITIVE");
			}else{
				System.out.println("Ufff!!!!...Its NegatIVE");
			}
		}

	}

}
