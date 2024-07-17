package Practise;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring arrays
		
		//Type1
		
		/*int a[] = new int [5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;*/
		
		//type 2
		int a[] = {100,200,300,400,500,600,700};
		
		//find size of array
		System.out.println("Length of an array " + a.length);
		
		//read single value from an array
		System.out.println(a[4]);
		
		//multiple values or reading all values
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		//enhanced for loop for each loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
