package GulamBhai;

import java.util.HashSet;
import java.util.Set;

public class  Duplicate_Remove {
	public static void main(String[] args) {
		
		String s= "qhsdiwejhewbduoekjjiewobnnaqw";
		char[] ch=s.toCharArray();
		StringBuilder result=new StringBuilder();
		Set<Character> mySet= new HashSet<>();
		for(int i=0;i<ch.length;i++) {
			mySet.add(ch[i]);
		}
		 for(char c:mySet) {
			//result.append(c).append(",");
			System.out.print(c+" ");
		}
       
		//System.out.println(result);
      
	}

}
