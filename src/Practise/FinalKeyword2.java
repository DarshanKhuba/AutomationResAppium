package Practise;


final class Test1
{
	final void m()
	{
		System.out.println("This method m is from Test1"0;
		
	}
}

class Test2 extends Test1//class cannot be extended bcz final keyword is used 
{
	void m()// incorrect bcz m is given with final keyword
	{
		System.out.println("this is method from  test 2...");
	}
}

public class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();

	}

}
