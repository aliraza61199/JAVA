package STRING;

import org.checkerframework.checker.units.qual.s;

public class String2 {

	public static void main(String[] args) {
		
		String str = "good";  //reverse
		String str1 = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			str1= str1+str.charAt(i);		
		}
		System.out.println(str1);	
		}
  }

