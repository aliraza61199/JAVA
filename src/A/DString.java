package A;

public class DString {  
public static void main(String[] args) {
	String a="abcd";

	String b="abcd";
	if(a==b)
	{
		System.out.println("same" +  b);
		
	}
	if(a.contains(b)) {
		System.out.println("not same" +   a);
	}
	
}
}
