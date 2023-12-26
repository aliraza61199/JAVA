package EXCEPTION01;

public class Throwskeywords {

	public static void main(String[] args) {
		age(12);
	}

	public static void age(int ag) {
      if(ag<18)
      {
    	  throw new ArithmeticException("Its not Elegible");
      }
      else
      {
    	  System.out.println(" it elegible for vote");
      }
	}

}
