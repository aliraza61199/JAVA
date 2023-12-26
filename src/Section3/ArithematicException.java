package Section3;

public class ArithematicException {

	public static void main(String[] args) {
	
		System.out.println("GET SET");
		System.out.println("START");
		try 
		{
			System.out.println(23/0);
			System.out.println("END");	
		}
		catch(ArithmeticException e) {
            System.out.println("Ball catch");
            System.out.println(e.getMessage());
            System.out.println("BALL THROW");
	}

	}
}
                                                   // GET SET
                                                   // START
                                                    //Ball catch
                                                    //  / by zero
                                                   //BALL THROW
