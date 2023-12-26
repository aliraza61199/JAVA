package EXCEPTION01;

public class MultipleMethodThrow {

	public static void m1()
	{
		m2();
		
	}
	public static void m2()
	{
		m3();
	}
	public static void m3()
	{
		throw new ArithmeticException();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			m1(); 
		}
			catch(ArithmeticException e) {
				
			System.out.println(e.getMessage());
			
		}
	

}
}
