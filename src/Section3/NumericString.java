package Section3;

public class NumericString {

	public static void main(String[] args) {
		String s= "R098772d1123mnjhjj66543";
		//String  s1= " ";
		//int count =0;
	
		for (int i=0;i<s.length();i++) {
			
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				
				//count++;
	       
	         System.out.print(s.charAt(i)+" ");
	      //  s1=s1+s.charAt(i);
	      // System.out.println(s);
	      // System.out.print(count+" ");
			}
		}
	}
}


  //0 9 8 7 7 2 1 1 2 3 6 6 5 4 3     output