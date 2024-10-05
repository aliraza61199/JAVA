package NeeewCllasss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemoveIntegerFunction {

	public static void main(String[] args) {

		//int[] arr= {2,4,6,7,1,2,4,3,2,4,6,7,1,2,4,3};
		String s="raza ali duplicate remove";
		char[] arr=s.toCharArray();
		Set<Character> a2=new HashSet<>();
	    for(Character i:arr) {
		a2.add(i);
		
	    }
	for(char i:a2) {
		System.out.println(i);
	}
	
	}

}
