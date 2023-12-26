package NumberQ;

public class palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n= 34043 ;
		int  rem= 0 , sum=0;
		while (n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println("palindrome no is"+sum);
		}
}
