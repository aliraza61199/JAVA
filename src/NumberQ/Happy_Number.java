package NumberQ;

public class Happy_Number {
 public static void main(String[] args) {
	int num=13;
	int rem=0;
	if(num==7) {
		System.out.println("Happy Number");
	}
	else {
		while(num>9) {
			int sum=0;
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem);
			    num=num/10;
			}
		num=sum;
		
		}
	}

	if(num==1)
		System.out.println("Happy Number");
	else
		System.out.println("Not happy Numner");
 
 }
}
