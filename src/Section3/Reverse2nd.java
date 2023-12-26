package Section3;

public class Reverse2nd {

	public static void main(String[] args) {
	
		String s= "I am good";
		String s1=" ";
		
		String []str1=s.split(" ");
           for (int i=str1.length-1;i>=0;i--) {
        	     
        	   
        	System.out.print(str1[i]+" ");   
           }
		
	}

}
