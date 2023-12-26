package Newclass;

public class palindrom {

	public static void main(String[] args) {

		int num= 12321;
		int sum=0, rem=0;
		
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
			
		System.out.println(sum);	
	}

}
