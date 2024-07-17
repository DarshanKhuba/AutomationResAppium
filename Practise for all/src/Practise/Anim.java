package Practise;

public class Anim {
	String color = "White";

void eat()
{
	System.out.println("Eating.....");
}
}

class Dog extends Anim
{
	String color ="black";
	void displayColor()
	{
		System.out.println(super.color);
	}
	void eat()
	{
		System.out.println("Eating leg piece.....");
		super.eat();
	}

	
	

	}
