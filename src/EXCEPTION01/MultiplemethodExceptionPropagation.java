package EXCEPTION01;

public class MultiplemethodExceptionPropagation {

	 
	public static void m1() {
		m2();
		
	}
	public static void m2() {
		m3();
		
	}
	public static void m3() {
		
	System.out.println("main");
	try 
	{
		System.out.println("before exception");
		System.out.println(10/0);
		System.out.println("arthematic exception");
	}
	catch(ArithmeticException e)
	{
		System.out.println("inside catch");
		System.out.println(e.getMessage());
		System.out.println("end");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		m1();
	
		
	}
}
	


