package Section3;

public class OddEvenException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=29;
     try {
    	 if (n%2==0) {
   System.out.println("number is Even");
    	 }
   else
   {
	   System.out.println("number is Odd");
	   
   }
    	 
     
	}
	catch (ArithmeticException s)
	{
		System.out.println(s.getMessage());
	}

}
}
