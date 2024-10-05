package Section3;

public class AphabetsString {

	public static void main(String[] args) {
		 
		String s= "R443456A098787Z9879A";
		String s2 = " ";
		int count =0;
		
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				count++;
				s2=s2+s.charAt(i);
				
				
			}
		}
		System.out.println(s2);
		System.out.println(count);

	}

}
