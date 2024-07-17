package Practise;

public class SearchingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,90,70,60};
		int search_element=1000;
		
		boolean status = false;
		
		/*for(int i =0;i<a.length;i++)
		{
			if(a[i] == search_element)
			{
				System.out.println("Element Found");
				status = true;
				break;
			} 
		}
		
		if(status==false)
		{
			System.out.println("Element not found");*/
		for( int x : a)
		{
			if(x == search_element)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
