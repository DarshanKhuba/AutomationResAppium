package Practise;


class Test
{
	final int x =100;
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//t.x=200;   //Value cannot be changed after applying final keyword
		System.out.println(t.x);
		
		

	}

}
