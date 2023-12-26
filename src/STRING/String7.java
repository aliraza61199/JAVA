package STRING;

public class String7 {

	public static void main(String[] args) {

		String s= "HAPPY BIRTHDAY SALMAN";
		String s1="";
		 String[] ar = s.split("");
		 
		 for(int i=0;i<s.length();i++) {
			// System.out.println(ar[i]);
			
			 s1=" ";
			 s1=s1+ar[i];
			 
			 for(int j=s1.length()-1;j<=0;j--) {
				 
			 }
			 System.out.println(s1);
			 
		 }
	}

}
