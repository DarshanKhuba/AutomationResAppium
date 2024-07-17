package Practise;

import java.util.Scanner;

public class CircumferenceAndAreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radis of the circle:");
		double radius = sc.nextDouble();
		
		double circumference = 2 * 3.14 * radius;
		
		double area = 3.142 * radius * radius;
		
		System.out.println("The circumference of circle is: " + circumference);
		System.out.println("The area of the circle is: " + area);
		}

}
