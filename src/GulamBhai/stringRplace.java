package GulamBhai;

import java.util.Scanner;

public class stringRplace {
public static void main(String[] args) {
	StringBuilder result=new StringBuilder();
	String s="nhb.nh.ndhud";
	char[] arr=s.toCharArray();
	for(char ch:arr) {
		if(ch=='.') {
			result.append(" ");
		}else {
			result.append(ch);
		}
	}
	
	System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Scanner sc= new Scanner(System.in);
//	System.out.println("enter replace letter");
//	String s ;  //"ali.sehar.raza.numan"
//	 String s1="";
//	 char ch= sc.next().charAt(0);
//	 sc.nextLine();
//	 System.out.println("enter ");
//	 s=sc.nextLine();
//	 for(int i=0;i<s.length();i++) {
//		 if(s.charAt(i)==ch)
//			 s1=s1+' ' ;
//			 else
//				 s1= s1+s.charAt(i);
//		 }
//	 
//		System.out.println(ch+":"+s1); 
	 }
}
