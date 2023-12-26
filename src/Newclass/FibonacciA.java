package Newclass;

public class FibonacciA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=1, n2=3, sum=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println(n1);
	    sum=n1+n2;
		n1=n2;
		n2=sum;
			
		}
	}

}
