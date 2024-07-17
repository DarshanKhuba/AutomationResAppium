package com.Functions;

public class D03Returnfunction {
	
	public static double calareaofcircle(int rd)
	{
		double area = 3.142 * rd * rd;
		return area;
	}

	public static void main(String[] args) {
		//double area = calareaofcircle(5);
		//System.out.println("Area of circlr: " + area);
		
		//double area;
		//area = calareaofcircle(5);
		//System.out.println("Area of circlr: " + area);
		
		System.out.println("Area of circle: " + calareaofcircle(5));
		
		/*
		 * Points to be noted about return statement
		 * 1. return statement returns single value to calling function
		 * 2. return statement is used to break/terminate the function
		 * 3. return statement can return single value at a time but function 
		 * 		may have multiple return statements.
		 * 4. return statement will transfer the control back to calling function
		 */
		

	}  

}
