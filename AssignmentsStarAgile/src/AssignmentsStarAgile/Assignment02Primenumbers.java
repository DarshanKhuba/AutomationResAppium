package AssignmentsStarAgile;

public class Assignment02Primenumbers {
	public static void main (String [] args) {
		int i, j, num = 100;
		System.out.println("Prime number between 1 to 100 are: ");
		for(i = 2; i <= num; i++) {
			for(j = 2; j < i; j++) {
				if(i != j) {
					if(i % j != 0)
						continue;
					else
						break;
				}
			}
			if(i == j)
				System.out.print(i + ",");
		}
		
	}

}
