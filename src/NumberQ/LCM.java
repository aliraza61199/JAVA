package NumberQ;

public class LCM {
	
	public static void main(String[] args) {
		
		int a=12 , b= 4;
		int lcm=0;
	
		for(int i=1;i>=0;i++) {
			if((i%a==0)&&(i%b==0)) {
				
				lcm=i;
				break;
				
			}
		}
		System.out.println(lcm);

}
	}
