package Secssion1;

public class Pattarn {

	public static void main(String[] args) {
		 
		String s1= "AL#@I#$@RA@*ZA";
		String s2= "";
	       int count=0;
		 for (int i=0;i<s1.length();i++) {
			
			 if (s1.charAt(i)>= 'A'&& s1.charAt(i)<='Z')
			 {
		       count ++;
		
				 s2=s2+s1.charAt(i);
			 
				 }
		 }
          System.out.println(s2);
          System.out.println(count);
          System.out.println(s1.length());
	}

}
