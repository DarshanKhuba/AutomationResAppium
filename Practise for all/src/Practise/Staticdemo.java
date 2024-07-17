package Practise;

public class Staticdemo {
	
	static int a = 10;  //static var
	int b=20;    //non static var
	
	static void m1()
	{
		System.out.println("this is m1 ststic method.....");
	}
	
	void m2()
	{
		System.out.println("this is mm2 non ststic method.....");
	}
	
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
}

	/*public static void main(String[] args) {
		/*
		System.out.println(a);
		m1();
		m2();
		
		
		Staticdemo sd = new Staticdemo();
		System.out.println(sd.b);
		sd.m2();
		
		Staticdemo sd = new Staticdemo();
		sd.m();*/

	

