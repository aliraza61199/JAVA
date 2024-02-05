	package STRING;
	
	public class S1reversewithCapital_ {
	
	public static void main(String[] args) {
	    
		String str= "how are you";//[how][are][you]
		String s1="";
	    String[] ch=str.split(" ");
	    for(String c:ch) {
	    String s=test(c);
	     s1=s1+s+" ";
	     
	    }
	   System.out.println(s1.toUpperCase());
	}
	
	public static String test(String c) {
		String s="";//how
	for(int i=c.length()-1;i>=0;i--) {
		s=s+c.charAt(i);
	}
	return s;	
		
	}
	}
