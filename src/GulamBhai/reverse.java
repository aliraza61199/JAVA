package GulamBhai;

public class reverse {

	public static void main(String[] args) {
		
	
	String s="gulam nousad ali";
	//String s1= "";
	String s2="";
	String[] sp = s.split(" ");
	for(String st:sp) {
		for(int i=st.length()-1;i>=0;i--) {
		//for(int i=0;i<st.length();i++) {
			s2= s2+st.charAt(i);
		 }
	 s2=s2+" ";
	   }
	System.out.println(s2);
	
	}
	
	}
	
