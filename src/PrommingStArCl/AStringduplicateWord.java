package PrommingStArCl;

import java.util.HashMap;
import java.util.Map;

public class AStringduplicateWord {

	public static void main(String[] args) {

		String st= "ishika is distination is ";
		
		char[] st1 = st.toCharArray();
		//String[] spt = st.split(st);
		Map<Character,Integer> map= new HashMap() ;
		
		for(char c:st1) {
			if(c!=' ') {
				map.put(c,map.getOrDefault(c, 0)+1);
			}
		 }
		for(Map.Entry<Character,Integer> result:map.entrySet()){
			if(result.getValue()>1) {
				System.out.println(result.getKey());//+" : "+result.getValue()
			}
		}
		
		}
}
