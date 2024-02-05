package Methoda;

public class methodPalendrom {

	public static void main(String[] args) {

		int num=120201;
		m1(num);
		
	}

	public static void m1(int num){
		
		int sum=0, rem=0  ;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
	
         System.out.println(sum);
	
	}
}

