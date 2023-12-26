package STRING;

import java.util.Scanner;

public class convertStoP {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string value");
        String str  = sc.next();
        
		
		int i= Integer.parseInt(str.toString());  //this statement use to convert string to integer
		System.out.println(i/2);
		char[] ch=  str.toCharArray();
		 for(char c:ch) {
			 if(Character.isDigit(c)) {
				 
			 }
			 System.out.println(c);
		 }	
	}

}
