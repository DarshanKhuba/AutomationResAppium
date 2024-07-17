package Practise;

public class Student{
	int sid;
	String sanme;
	char grad;
	
	void printstudentdata()
	{
		System.out.println(sid +" "+sanme+" "+ grad);
	}
	
	
	//type 2
	void setstudentdta(int id, String name, char gr)
	{
		sid = id;
		sanme = name;
		grad=gr;
	}
	Student(int id, String name, char gr)
	{
		sid = id;
		sanme = name;
		grad=gr;
	}


}
