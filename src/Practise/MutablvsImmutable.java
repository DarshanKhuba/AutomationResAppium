package Practise;

import java.util.Arrays;

public class MutablvsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,50,40};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
		//immutable
		String s = new String("Welcome");
		System.out.println(s);
		s.concat("to java");//cannot be changed
		String concatstrings = s.concat("to java");
		System.out.println(s);
		System.out.println(concatstrings);

	}

}
 