package GulamBhai;

import java.util.TreeSet;

public class Short {
	public static void main(String[] args) {
		
	
	String s= "qwsaedrftgyhujikolpmnbvcxz";
	char[] ch=s.toCharArray();
	
	TreeSet<Character> ts= new TreeSet<>();
	for(char c:ch) {
		ts.add(c);
		System.out.print(c+",");
		
	}
	//System.out.println("\n"+"  ");
	for(char c1:ts) {
		System.out.println(""+c1);
	}
	
	}
}
