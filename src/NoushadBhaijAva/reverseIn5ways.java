package NoushadBhaijAva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class reverseIn5ways {

	public static void main(String[] args) {
		
		String s= "ali raza";
		s.split(" ");
		String s1= "";
		char[] ar=s.toCharArray();
	//	>>>>>>>>>>>>>>>>>1st<<<<<<<<<<<<<<<
//		for(int i=ar.length-1;i>=0;i--) {
//			//for(int j=ar.length-1;j<=0;j++)
//			System.out.print(ar[i]);
//		}
		
		//******************2nd*************************
		StringBuilder sb= new StringBuilder(s);
		String pr = sb.reverse().toString();
		System.out.println(pr);
	   // Arrays.reverse(null);
		 Stack a1=new Stack();
		 for(char ch:ar) {
			 a1.push(ch);
		 }
		 int index=0;
		 for(int i=0;i<ar.length;i++){
			 if(ar[i]>='a' && ar[i]<='z') {
			 ar[index++]=(char) a1.pop();
		  }
		 }
		 System.out.println(Arrays.toString(ar));
		//<<<<<<<<<<<<<<<<3rd>>>>>>>>>>>>>>>>>>>>
		 
//		ArrayList<Character> al= new ArrayList<Character>();
//		for(char ch:ar) { 
//		al.add(ch);
//	
//	}
//    Collections.reverse(al);
//    for(char ch1:al) {
//        sb.append(ch1);
//   
//   System.out.println(sb);
    ///}	 
		 StringBuffer sbu= new StringBuffer(s);
		StringBuffer pt = sbu.reverse();
		System.out.println(pt);
 	}
	
	}
