package STRING;

public class string5 { //string to primetive
	
	public static void main(String[] args) {
		
		String s= "1234ass";
//        int n=Integer.parseInt(s.toString());
//        System.out.println(n/2);
//        long l=Long.parseLong(s.toString());
//		System.out.println(l/2);
		char[] ch=s.toCharArray();
		for(char c:ch) {
		   if(Character.isDigit(c)) {   //number print  only
			   //if(Character.isAlphabetic(c)) {//alphabet print only
				   
			   }
			   System.out.println(c);
		   }
		}
	}

