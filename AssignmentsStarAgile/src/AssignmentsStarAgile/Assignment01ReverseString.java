package AssignmentsStarAgile;

import java.util.Scanner;

public class Assignment01ReverseString {
	public static void main (String [] args) {
		String name;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = scn.nextLine();
		
		//Reversed the string without using reverse() method
		String reverse="";
		for(int i = name.length() -1; i>=0 ; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("Without Reverse() Function:" + " " + reverse);
		
		//Reversed the string with using reverse() method
		StringBuffer y = new StringBuffer(name);
		y.reverse();
		System.out.println("With Reverse() Function by using string bufferclass :" + " " + y);
		scn.close();
		
	}

}
