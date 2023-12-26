package Grooming;

public class StringPlandrom {
	
	
	public static void main(String[] args) {
		
		
		String s ="madam";
		String s1=" ";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			s1= s1+s.charAt(i);}
			
		if (s.equals(s1)) {
		
			System.out.println("the String plandrom");
		}
			
			else
			{
			System.out.println("it is not String plandrom ");
		}
		}

 }

