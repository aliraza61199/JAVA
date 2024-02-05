package NoushadBhaijAva;

import java.util.TreeSet;

public class stringDuplicate {
    
	public static void main(String[] args) {
		
		String s= "good newspaper for everyone";
		char[] ch=s.toCharArray();
//		for(int i=0;i<=ch.length;i++) {
//			for(int j=i;j<=ch.length;j++) {
//				System.out.print(ch[j]);
//				if(ch[i]==ch[j]) {
					
		TreeSet<Character> set= new TreeSet<>();
		System.out.println(set);
		for(char c:ch) {
		set.add(c);
		System.out.print(c);
				}
		for(char c:set) {
			System.out.print(c);
			}
			
			
		}
	}

