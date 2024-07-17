package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class CollectionListInter {
	public static void main(String[] args) {
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		
		
		//ArrayList <Integer> mylist = new ArrayList<Ieteger>();
		
		
		
		
		//Adding data to array list
		mylist.add(100);
		
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(null);
		mylist.add(true);
		mylist.add(100);
		
		
		//size of array lis
		System.out.println("size of arraylist:" + mylist.size());
		
		//printing arraylist
		System.out.println("Printing data from array list: "+ mylist);
		
		
		
		//Removing element from arraylist
		mylist.remove(4);
		
		//after removing
		System.out.println("Printing data from array list: "+ mylist);
		
		
		//Inserting elemnt IN aRRAY LIsT
		mylist.add(2,"ANyas");
		System.out.println("After adding in array list: "+ mylist);
		
		
		//modifying the array list replace,change 
		mylist.set(2, "Anwaya");
		System.out.println("After Replacing: "+ mylist);
		
		
		//ACess specific e;lement from arrlist
		System.out.println(mylist.get(3));
		
		//reading all the elemrnts from the array list
		//Using normal for loop
		/*for (int i = 0; i < mylist.size(); i ++ )
		{
			System.out.println(mylist.get(i));
			
		}*/
		
	/*//Using  Enhanched for loop
		
		
		for(Object x : mylist)
		{
			System.out.println(x);
		}/*/
		
		//Iterator which is purely used for collectios to retrieve tha data
		Iterator it = mylist.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking arraylist is empty or not
		System.out.println("Is it TRUE: " + mylist.isEmpty());
		
		
		
		
		//REmove all elements in array list
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add(10.5);
		//mylist2.add("Welcome");
		mylist2.add(3);
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		//remove all the elements
		mylist.clear();
		System.out.println(mylist);
		System.out.println("Is my array list empty:" + mylist.isEmpty());
	}

}  


