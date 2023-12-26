	package B;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAString {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			String s= "ALI RAZA kh";
			String s1 = " ";
			String[] sa=s.split(" ");
			ArrayList a1=new ArrayList<>();
			a1.add("A");
			a1.add("L");
			
			for(int i=0;i<sa.length;i++)
			{
				System.out.println(sa[i]);
			}
			//*****************//
			Collections.reverse(a1);
			System.out.println(a1);
		 
			
				
				
			for ( int i=s.length()-1;i>=0;i--) {
				//s1=s1+s.charAt(i);
				System.out.println(s.charAt(i));
				
			}
			//System.out.println(s1);
			
		}
	
	}
