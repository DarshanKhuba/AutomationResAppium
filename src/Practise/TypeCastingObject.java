package Practise;

class pare
{
	String name = "John";
	
	void m1()
	{
		System.out.println("This is m1 from the parent....");
	}
}

class Child extends pare
{
	int id = 101;
	void m2()
	{
		System.out.println("This is m2 from the child");
	}
}

public class TypeCastingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Child c = new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();*/
		
	/*	pare p = new Child();
		System.out.println(p.name);
		p.m1();
		
		System.out.println(p.id);
		p.m2();
		/*
		 * 
		 * 
		 */
		
		
		
		pare p = new pare();
		Child c =(Child) p;
		
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
		
		
		
		

	}

}
