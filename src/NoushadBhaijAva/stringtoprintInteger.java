package NoushadBhaijAva;

import java.util.ArrayList;
import java.util.Iterator;

public class stringtoprintInteger {

	public static void main(String[] args) {

		String s= "2468";  //1234
		char[] ch=s.toCharArray();
		
		ArrayList<Character> ar= new ArrayList<>();
		for(char c:ch) {
			ar.add(c);
}
		 Iterator itr=ar.iterator();
	    while(itr.hasNext()) {
	    	Object obj = itr.next();
	    String s1= obj.toString();
		int n=Integer.parseInt(s1);
		System.out.println(n/2);
	
	}
	}
}

