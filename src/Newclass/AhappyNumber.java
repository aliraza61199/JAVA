package Newclass;

public class AhappyNumber {

	public static void main(String[] args) {
		int n=19;
		int rem=0;
		if(n==7) {
		System.out.println("number");
		}
		else {
			while(n>9) {
				int sum=0;
		while(n>0) {
			rem= n%10;
			sum= sum+(rem*rem);
			n= n/10;
		}
			n=sum;
		}
		}
	
			if(n==1) 
			System.out.println("happy");
		else 
			System.out.println("not happy number");
			
	    }
	}

