package Newclass;

public class Apalindrom {

	public static void main(String[] args) {

		int n = 121; int temp=n;
		
	int sum=0, rem =0;
	
	while(n>0) {
		rem=n%10;
		sum= (sum*10)+rem;
		n= n/10;
		
	}
	if(temp==sum) {
	System.out.println("Palindrom");
	}else {
		System.out.println("Not Palindrom");
	}
	}
	
}
