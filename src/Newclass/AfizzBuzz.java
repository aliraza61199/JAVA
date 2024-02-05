	package Newclass;
	
	public class AfizzBuzz {
	public static void main(String[] args) {
		
		int n=19;
		int sum=0, temp ,rem;
		if(n==7) {
			
		}else {
		
		while(n>9){
			while(n>0) {
				rem=n%10;
				sum= sum+(rem*rem);
				n=n/10;
			}
			n=sum;
		}
		}if(n==1)
		System.out.println("happy");
		else
			System.out.println("not happy");
		}
	}
	
