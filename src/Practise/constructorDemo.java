package Practise;

public class constructorDemo {
	int x,y;
	constructorDemo()  //defauklt
	{
		x=100;
		y=200;
	}
	
	constructorDemo(int a, int b)
	{
		x=100;
		y=200;
	}

	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {//invoke default
		//constructorDemo cd = new constructorDemo();
		
		constructorDemo cd = new constructorDemo(10,20);//parameter
		cd.sum();
		
	}
}
