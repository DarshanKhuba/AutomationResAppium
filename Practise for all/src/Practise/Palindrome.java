package Practise;

public class Palindrome {
	//public static void main() {
		/*int num = 1221;
		int rev = 0;
		int Orig = num;

			while (num != 0) {
				int digit = num % 10;
				rev = rev * 10 + digit;
				num = num/10;
			}
							
		
		if(Orig == rev) {
			System.out.println("the num is palindrome");
		}else {
		}	System.out.println("Not palindrome");
		
}
}/**/
    public static void main(String[] args) {
        int num = 1221; // Example number to check
        int originalNum = num; // Store the original number
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        // Check if the original number is equal to the reversed number
        if (originalNum == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        
    }
}
