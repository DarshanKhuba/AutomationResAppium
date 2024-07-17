package AssignmentsStarAgile;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment04ArrayAscending {

	public static void main(String[] args) {
		ArrayList<Integer> d = new ArrayList<>();
		d.add(5);
		d.add(70);
		d.add(37);
		d.add(97);
		d.add(01);
		System.out.println("Print the original array: " + d);
		Collections.sort(d);
		System.out.println("Sorted Array list with Ascending Order" + d);
		
	}

}
