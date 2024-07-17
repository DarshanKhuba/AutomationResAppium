package Practise;

public class Twodimensional {
	public static void main(String [] args) {
		//declaration array
		//type 1
		/*int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;*/
		
		//type2
		int a[][] = {{100,200},{300,400},{400,500}};
		
		
		//find size
		
		System.out.println("len of rows "+a.length);
		System.out.println("len od coloumns "+a[0].length);
		
		//read single values
		System.out.println(a[1][1]);
		
		//read all the rows and coloumns
	/*	
	 * for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			*/
			
			//enhanced for loop
			for(int arr[]:a)
			{
				for(int x:arr)
				{
					System.out.print(x + " ");  
				}
				System.out.println();
			}
			
				}

	
}