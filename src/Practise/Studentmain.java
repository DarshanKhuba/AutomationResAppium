package Practise;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student su = new Student();
		//using obj ref variabls
		/*su.sid=101;
		su.sanme="FDArs";
		su.grad='A';
		
		su.printstudentdata();*/
		
		//using method
		//su.setstudentdta(101,"dars",'A');
		//su.printstudentdata();
		
		
		//Constructor
		Student su = new Student(101,"DArs",'a');
		su.printstudentdata();
		
		 

	}

}
