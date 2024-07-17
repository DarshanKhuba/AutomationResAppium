package Practise;

public class StaticMain {
	
	public static void main(String[] args) {
		

		
		System.out.println(Staticdemo.a);
		Staticdemo.m1();
		//Staticdemo.m2();
		
		
		Staticdemo sd = new Staticdemo();
		System.out.println(sd.b);
		sd.m2();
		
		//Staticdemo sd = new Staticdemo();
		sd.m();

}
}  