package EXCEPTION01;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			System.out.println("main");
			System.out.println(10/0);
			System.out.println("raza");
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage() );
			
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.hashCode());
			System.out.println(e.toString());
			System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
			System.out.println("tiger");
			System.out.println(e.getClass());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
			System.out.println(e.initCause(null));
			//System.out.println(e.printStackTrace());
		}
		
	}

}
