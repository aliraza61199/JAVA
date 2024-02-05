package GulamBhai;

public class Stringwithoutreplace {

	public static void main(String[] args) {
	
			String s="gulam.ahmed.raza";
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='.') {
					sb.append(' ');
				}
				else {
					sb.append(s.charAt(i));
				}
			}
			System.out.println(sb);
		}
}
