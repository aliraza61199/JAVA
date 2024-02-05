package Methoda;

import java.util.Arrays;

public class Method1RemoveDuplicate {

	public static void main(String[] args) {

		String s="";
	char[]	ch=s.toCharArray();
  char[]	result=m1(s);
    System.out.println(Arrays.toString(result));		
	}
	public static char[] m1(String s) {
		char[]	ch=s.toCharArray();

		char[] result=new char[ch.length];
		int i=0;
		for(char c:ch) {
			if(c=='a'||c=='b'||c=='c') {
				
			}else {
				result[i]=c;
				i++;
			}
		}
			
		return result;
		
	}

}
