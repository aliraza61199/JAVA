package ARray;

import java.util.Arrays;

import STRING.string5;

public class Accending {

	public static void main(String[] args) {
		
		String s= "7893521460";
        char[] ch=s.toCharArray();
		String s1=" ";
		Arrays.sort(ch);
		for(char c:ch) {
		s1=s1+c;
		}
			System.out.println(s1);
	}
	}

