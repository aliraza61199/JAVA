package Section3;

public class StringException {

	public static void main(String[] args) {
		String s ="Kulsoom";
		System.out.println("start  count");
		try {
			System.out.println("TRY to CATCH word");
		
		System.out.println(s.charAt(8));
		System.out.println(" TRY thROW word");
		}
		catch (StringIndexOutOfBoundsException r) {
			System.out.println("CATCH THE WORD");
			System.out.println(r.getMessage());
		}
		System.out.println("THROW THE WORD JVM");

	}
	}
 //start  count
//TRY to CATCH word
// CATCH THE WORD
//String index out of range: 8
//THROW THE WORD JVM

