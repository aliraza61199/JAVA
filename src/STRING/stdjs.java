package STRING;

public class stdjs {

	public static void main(String[] args) {
	
	String s="selenium.java.automation";
	String[] s1= s.split(".");
	char[] ch= s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!='.') {
           // ch[i]=' ';
			System.out.print(ch[i]);
		
		}
		
		
	}
		
	}
	
}

