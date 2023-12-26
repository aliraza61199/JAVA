	package StringClasses;
	
	public class AlphabetsOnly {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String S="g234e67n34el34i23a";
	String S1=" ";
	int count=0;
	
	
	for (int i=0;i<=S.length();i++)
	{
		if(S.charAt(i)>='a'&& S.charAt(i)<='z') {
			count++;
		
			S1=S1+S.charAt(i);
		}
			System.out.println(S1);
		
			System.out.println(count);
		
	}
		}
	
	}
