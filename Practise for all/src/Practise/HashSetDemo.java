package Practise;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.*
import java.util.Iterator;



public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decleration
		
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		
		//HashSet <String>myset = new HashSet<String>();
		
		//Adding Elements in to HAshSet
		myset.add(100);
		myset.add(null);
		myset.add("Welcome");
		myset.add('A');
		myset.add(null);
		myset.add(100);
		
		//Printing HashSet
		System.out.println(myset);
		
		
		//Removing Element in HashSet
		myset.remove('A');
		System.out.println("After Remoning the value----> " + myset);
		
		
		
		//Inserting Elemet is also not possible
		//Access specific eleme t is  not possible
		
		
		//Convert HashSet to ArrayList
		ArrayList al = new ArrayList(myset);
		//System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all the Elements using For Each Loop
		/*for(Object X : myset)
		{
			System.out.println(X);
		}*/
		
		
//Using Iterator
		Iterator <Object>  it = myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Clearing All elememts from HasSert
		
		
		myset.clear();
		System.out.println(myset);
		System.out.println("Is it TRUE?? " + myset.isEmpty());
		
		
		
		//Size
		myset.size();
		System.out.println("Size of HashSet " + myset.size());
	
		 
	}
	

}
