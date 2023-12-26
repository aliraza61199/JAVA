package Section3;

public class ExceptionStringIndex {

	public static void main(String[] args) {
		
		String s = "Genelia";
		System.out.println("Start Count");
		System.out.println(s.charAt(9));
		System.out.println("End Count");
		

	}

}
            //Start Count
                    //      Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
                    //	at java.lang.String.charAt(String.java:658)
	                   //at Section3.ExceptionStringIndex.main(ExceptionStringIndex.java:9)
