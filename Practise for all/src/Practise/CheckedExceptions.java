package Practise;

public class CheckedExceptions {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Game starts---->");
		System.out.println("Progress...........");
		
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{  }
		
		System.out.println("Game Over");
		System.out.println("Exit Game!!");

	}

}
