package B;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new  Scanner(System.in);
		System.out.println("enter the number");
		int sum=0;
	int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				
				sum=sum+i;
			}
		System.out.println(sum);
			}
		
	}

}
