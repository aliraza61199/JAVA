package Section3;
  
public class CountwordString {

	public static void main(String[] args) {
		
          String  s="My name is Ali Raza";
		
		  int count =0;
		  
		  for (int i=0;i<s.length();i++) {
			  
			  if (s.charAt(i)==' ') {
				  count++;
			  }
		  }     
	
		  int sum=count+1;
		  System.out.println("the number words in the given sentence is:"+sum); 
      }
}
