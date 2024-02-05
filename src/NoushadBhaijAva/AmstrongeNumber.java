package NoushadBhaijAva;

public class AmstrongeNumber {

	public static void main(String[] args) {
		String s1="407";
		int power=s1.length();
		int s= Integer.parseInt(s1);
		int temp=s;
		int sum=0,cube=0,rem=0;
		while(s>0) {
			rem=s%10;
			sum=(int)(sum+Math.pow(rem, power));
			s=s/10;
		}
		if(sum==temp) {
			System.out.println("its a armstrong number");
		}
		else {
			System.out.println("NOT A armstrong number");
		}
	}

}
