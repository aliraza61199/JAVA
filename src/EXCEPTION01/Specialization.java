package EXCEPTION01;

public class Specialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,2,3,4,5,6,7,8,0};
		try
		{
			System.out.println(a[5]/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}

}
