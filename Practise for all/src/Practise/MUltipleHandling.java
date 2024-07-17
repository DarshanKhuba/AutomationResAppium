package Practise;

public class MUltipleHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GAsme starts");
		String s = null;
		
		try
		{
		System.out.println(s.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Handle exception");
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("GAme over");

	}

}
