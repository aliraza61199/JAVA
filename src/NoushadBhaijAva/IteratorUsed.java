package NoushadBhaijAva;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUsed {
       public static void main(String[] args) {
		String s="1233";
		char[] arr=s.toCharArray();
		ArrayList<Character> a1=new ArrayList<>();
		for(char c:arr) {
			a1.add(c);
		}
	    Iterator itr=a1.iterator();
	    while(itr.hasNext()) {
	    	Object obj=itr.next();
	    	String s1=obj.toString();
	    	int n=Integer.parseInt(s1);
	    	System.out.print(n/2);
	    }
       }
}
