package GulamBhai;

public class reverseOrder {

public static void main(String[] args) {
	String s="gulam nousad ali";
	//String op="malug dasuon ila";str
	
	String s1= "";
	String[] spt = s.split(" ");
	
	for (String str:spt) {
		String st=revers(str); 
		s1=s1+st+" ";
	}
	System.out.println(s1);
}
	public static String revers(String str) {
		String s2=" ";
		for(int i=str.length()-1;i>=0;i--) {
			s2= s2+str.charAt(i);
	}
		return s2;

}
}
