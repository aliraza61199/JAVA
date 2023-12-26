package ARray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Accendingorder {
	public static void main(String[] args) {
		String s = "plmkoijnbhuygvcftrdxzsewaq";
		char[] ch = s.toCharArray();
		//Arrays.sort(ch);
		String s1 = "";
		
//		for (char c : ch) {
//			s1 = s1 + c;
//		}
//		System.out.println(s1.toUpperCase());
		///////////////////////////////////////////////////////////
//		ArrayList<Integer> a1=new ArrayList<>();
//		for(char c:ch) {
//			a1.add((int) c);
//		}
//	
//	Collections.sort(a1);
//	System.out.println(a1);
		/////////////////////////////////////
		TreeSet<Character> a1=new TreeSet<>();
		for(char c:ch) {
			a1.add(c);
		}
	System.out.println(a1);
		////////////////////////////////////////////
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[i]<ch[j]) {
					char temp=ch[i];
							ch[i]=ch[j];
							ch[j]=temp;
				}
			}
		}
	for(char c:ch) {
		s1=s1+c;
	}
	System.out.println(s1);
	}
}
