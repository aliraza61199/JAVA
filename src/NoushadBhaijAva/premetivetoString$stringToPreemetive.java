package NoushadBhaijAva;

public class premetivetoString$stringToPreemetive {
      public static void main(String[] args) {
		int n=1234;
		
		String s=String.valueOf(n);
	char[]	ch=s.toCharArray();

		int n1=Integer.parseInt(s);
		for(int i:ch) {
			System.out.println(i);	
		}
		Integer N=Integer.valueOf(n);
		int n3=N.intValue();
		
		System.out.println(n3);
		System.out.println(n1/2);
	}
}
