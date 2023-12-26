package A;

public class ConstructorOverloading {  //Student Database

	String StudentName;
	double StudentMark;
	double    StudentNumber;
	int    StudentId;
	
	public ConstructorOverloading (String Name,double Mark,double Number,int Id )
	{
		StudentName = Name ; 
		StudentMark=Mark;
		StudentNumber= Number ;
		StudentId =Id ;
	}
	public ConstructorOverloading (String Name,double Mark,int Id ) {
		StudentName = Name ; 
		StudentMark=Mark;
		StudentId =Id ;
	}
	public ConstructorOverloading (String Name, int Id ) {
		StudentName = Name ; 
		StudentId =Id ;
	}
	public ConstructorOverloading (String Name ) {
		StudentName = Name ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading S1= new ConstructorOverloading("Ali Raza",379.6, 9134899340.2 ,4356);
		ConstructorOverloading S2= new  ConstructorOverloading("Raza",404.5,4890);
		ConstructorOverloading S3 = new  ConstructorOverloading ("Neha" ,1803 );
		ConstructorOverloading S4 = new ConstructorOverloading ("Ishika");
		
		System.out.println(S1.StudentName);
		System.out.println(S1.StudentMark);
		System.out.println(S1.StudentNumber);
		System.out.println(S1.StudentId);
	
		System.out.println("  ");

		
		System.out.println(S2.StudentName );
		System.out.println(S2.StudentId);
		System.out.println(S2.StudentMark);
		
		System.out.println("  ");

		System.out.println(S3.StudentName );
		System.out.println(S3.StudentId);
		
		System.out.println("  ");

		
		System.out.println(S4.StudentName);
		
		
	}

}

