package PrommingStArCl;

public class AStringrever1stand2ndhalfseparately {   //first half separately and 2nd half separately

	public static void main(String[]args) {
	String s1= "Ishika";
	String s="";
	for(int i=s1.length()-1;i>=0;i--) {
		s=s+s1.charAt(i);
	}
	int n=s.length();
	int half=n/2;
	StringBuilder result=new StringBuilder();
	result.append(s.substring(0,half).toUpperCase()).append(s.substring(half).toLowerCase());
	System.out.println(result);
	}

	
}
