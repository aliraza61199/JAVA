package StringClasses;

public class Reverse {

	public static void main(String[] args) {

		String  s= "He is good man";
		
		String str[]= s.split(" ");
		String s1=" ";
		String s2 =" ";
		for ( int i=s.length()-1 ;i>=0;i--) {
		//for (int i=0;i<=s.length()-1;i--)	
			
			System.out.print(str[i]+" ");
		}
		

	}

}
