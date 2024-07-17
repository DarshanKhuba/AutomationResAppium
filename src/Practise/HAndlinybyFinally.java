package Practise;

public class HAndlinybyFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		catch(NumberFormatException e)
		{
			System.out.println("catch handles exception ");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("You entered into finally block");
		}
		System.out.println("program finished:");
	
		

	}

}
