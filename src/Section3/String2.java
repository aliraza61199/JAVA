package Section3;

public class String2 {

	public static void main(String[] args) {
	   
		String s= "Hi How Are You" ;
		int count =0;
		 
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				
				count++;
			
			System.out.println("the total no of whitespace are" +count);
			}
		}
		
		

	}
}


