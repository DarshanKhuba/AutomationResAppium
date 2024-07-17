package Practise;

public class StringComparisons {
	public static void main(String[] args) {
		//sc1
	/*	String s1 = "Welcome";
		String s2 = "Welcome";		
				System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		
		//case2
		/*
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s1==s2);//False
		System.out.println(s1.equals(s2));
		*/
		
		//case3
		/*
		String s1="abc";
		String s2 = new String("abc");

		System.out.println(s1==s2);//False
		System.out.println(s1.equals(s2));
		*/
		
		
		//case 4 
		String s1 = "abc";
		String s2= new String("abc");
		String s3=s2;
		
		System.out.println(s1 == s2);//False
		System.out.println(s1.equals(s2));
		
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		
		System.out.println(s1 == s3);//False
		System.out.println(s1.equals(s3));
		
		
	}

}
