package NoushadBhaijAva;

import java.util.ArrayList;

public class MissingCharachter {

	public static void main(String[] args) {

		char[] ch= {'a','b','d','g','j','k','m'};
		ArrayList<Character> a1= new ArrayList<>();
		for(char collect:ch) {
			//System.out.println(collect);
			a1.add(collect);
			
			char chara=ch[ch.length-1];
			for(char i='a';i<chara;i++) {
				if(!a1.contains(ch)) {
				System.out.println(ch);
			}
		}
	}
	}
}
