package Practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main (String args[]) {
		//Declaration
		//HashMap map = new HashMap();
		//Map hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Adding Pairs
		hm.put(101, "DArs");
		hm.put(102, "DArskiljdhbnu");
		hm.put(103, "KEys");
		hm.put(104, "Nadc,n");
		
		System.out.println(hm);
		
		
		//Size of HAhMAp
		System.out.println("Size of HashMap is: " + hm);
		
		//After removing the HAshMap
		hm.remove(103);
		System.out.println("After Removing: " + hm );
		
		//Access the valur of the key
		System.out.println(hm.get(102));
		
		//Get all the keys from HashMap
		System.out.println(hm.keySet());   //only keys
		System.out.println(hm.values());   //only values
		System.out.println(hm.entrySet());    //All values
		
		
		//REading DAta From HASHsET
		//Using For...Each
		
		
		/*for(int k:hm.keySet())
		{
			System.out.println(k + " "+hm.get(k));
		}*/
		
		//USinf Iterotr
		Iterator<Entry<Integer,String>> it =hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry =  it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		hm.clear();
		System.out.println(hm.isEmpty() + ": No worries ");
	}

}
