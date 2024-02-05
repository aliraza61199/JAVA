package GulamBhai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateRemover {
public static void main(String[] args) {
	String s="1234445457613434900754";
	char[] ch= s.toCharArray();
	
//<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>><<<<<<<<<<<<*>>>>>>>>><<<<<<<*>>>>>>>>>>>>><<<<<<<<<<<<*>>>>>>>	
//Set<Character> a1= new HashSet<Character>();	
//	for(char c:ch) {
//		a1.add(c);
//		System.out.println(a1);
//	}
//	
//    for(char c1:a1) {
//    	System.out.println(c1);
	// }
	
	for(int i=0;i<ch.length;i++) {
		
		for(int j= i+1;j<ch.length;j++) {
			
			if(ch[i]==ch[j]) {
			
			System.out.println(ch[j]);
			}
		}
	}
}
	
	
}

