package Practise;

public class TerneryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 100, b = 150;
		int largest = (b < a)? a : b ;
		System.out.println("The value is: " + largest);*/
		
		/*int a = 100, b = 150;
		int largest;
		
		if (a> b) {
			largest = a;
		}else {
			largest = b;
		}
		System.out.println("the largest number is " + largest);*/
		
		
		/*int a =100, b=150, c=200;
		int num;
		if (a>b && a>c) {
			System.out.println("The largest number is:" + a);
		}
		  if (b>a && b>c) {
				System.out.println("The largest number is:" + b);
			}
		  else
			  System.out.println("The largest number is:" + c);
		}*/
		
		String weekName = "Kutha chap";
		int weekNumber;
		switch (weekName){
		case "Monday": weekNumber = 1; break;
		case "Tuesday": weekNumber = 2;	break;
		case "Wednesday": weekNumber = 3;	break;
		case "Thursday": weekNumber = 4;break;
		case "Friday": weekNumber = 5;	break;
		case "Saturday": weekNumber = 6;	break;
		case "Sunday": weekNumber = 7;	break;
		
		default:
			weekNumber = 0; break;
		}
		if (weekNumber != 0) {
            System.out.println("The week number for " + weekName + " is: " + weekNumber);
        } else {
            System.out.println("Invalid week name: " + weekName);
	}

	}
}

