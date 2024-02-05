package StringClasses;

public class AllpossibleforSplitinString {
    public static void main(String[] args) {
		String s="md.ali.raza";
		//String[] arr=s.split(" "); its not applicable for all character  Char=space ' ';
		//String[] arr=s.split("[.]"); its Applicable for all Character just go and check
		String[] arr=s.split("\\."); // its also Applicable for all Character just go and check
		for(String str:arr) {
			System.out.println(str);
		}
		char[] ch=s.toCharArray();
		StringBuilder result=new StringBuilder();
		for(char c:ch) {
			if(c=='.') {
				result.append(' ');//md ali 
			}else {
				result.append(c);//md ali raza
			}
		}
	System.out.println(result);
    }
}
