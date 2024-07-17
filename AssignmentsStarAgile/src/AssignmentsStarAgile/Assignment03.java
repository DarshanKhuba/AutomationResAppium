package AssignmentsStarAgile;

public class Assignment03 {

	public static void main(String[] args) {
		//Array Index Out of Bound
		try {
			int arr[]= {1,2,3,4};
			System.out.println(arr[7]);
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		
		//Null Pointer Exception
		try {
			int arr[] = null;
			System.out.println(arr.length);
		}
		catch (NullPointerException f) {
		System.out.println(f);
		}
		
	}

}
