package StringClasses;

public class whitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "A L I          R A Z A";
		String[] s1 = s.split(s);
		int count =0;
		 for (int i=0;i<s.length();i++) {
			 if(s.charAt(i)==' ') {//&& s.charAt( i+1)!= ' ') {
				 count++;
			 }
		 }
			 System.out.println(count);
			 }
		 

	

}
