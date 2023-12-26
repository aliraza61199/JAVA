package Section3;

public class NullException {

	private char[] a;

	public static void main(String[] args) {
		System.out.println("start NULL value");
		NullException n=new NullException ();
		n=null;
		try {
			System.out.println(n.a);
			}
		catch (NullPointerException a) {
			System.out.println(a.getMessage());
			System.out.println("end NULL");
			
		
		}
	}

}
