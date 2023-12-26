package STRING;

import java.util.Arrays;
import java.util.TreeSet;

public class STRduplicateRemove {

	
	public static void main(String[] args) {
		
		String s= "womqpolczxhabrkdjrnsle";
		
		char[] arr= s.toCharArray();
		
		TreeSet<Character> a1=new TreeSet<Character>();
	   for(char ch:arr) {
		a1.add(ch);
	   }
	 
	   for(Character chh:a1) {
		System.out.println(chh);
	  }
	}
			
		
	}

