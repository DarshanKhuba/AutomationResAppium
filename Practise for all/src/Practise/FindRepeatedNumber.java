package Practise;

public class FindRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,40,10,60,10};
		int num=10;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println("The number is repaeted " + count + " times");
		
	}

}
