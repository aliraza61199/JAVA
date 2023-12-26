package StringClasses;

public class OverridenDemonstrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A="Girls";
		String A1=new String ("Girls");
		String A2="Ali";
				System.out.println(A.toString());
		System.out.println(A1);
		  System.out.println(A.hashCode());
		  System.out.println(A1.hashCode());
		  System.out.println(A2.hashCode());
		  System.out.println(A.equals(A1));
		  System.out.println(A.equals(A2));
		  System.out.println(A==A1);
		
	}

}
