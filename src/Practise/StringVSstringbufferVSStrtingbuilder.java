package Practise;

public class StringVSstringbufferVSStrtingbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings is immutable
		String s =" Welconme";
		s.concat("to java");
		System.out.println(s);
		
		//StringBuffer muttable
		
		/*StringBuffer s = new StringBuffer("Welcome");
		s.append("to java");
		System.out.println(s);
		*/
		
		//Stringbuilder muttables
		
		StringBuilder sr = new StringBuilder("Welcome");
		sr.append("to java");
		System.out.println(sr);

	}

}








