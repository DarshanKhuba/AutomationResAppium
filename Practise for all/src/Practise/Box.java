package Practise;

public class Box {
	double width, height, depth;
	
	Box()//1
	{
		/*width=0;
		height=0;
		depth=0;*/
		width=depth=height=0;
	}
	//type2
	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Box(double len)//3
	{
		width=depth=height=len;
	}
	
	double volume()//4
	{
		return(width*height*depth);
	}

}
