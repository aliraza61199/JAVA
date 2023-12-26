package NumberQ;

public class A {
  public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	int i,j,k;
	int [] LCM= {};
	for( i=2;i<=a;i++) {
		if(a%i==0) {
		
			System.out.println(i);
		}
	}
	for( j=2;j<=b;j++) {
		if(b%j==0) {
		
			System.out.println(j);
		}
	}
	for( k=2;k<=a;k++) {
		if(c%k==0) {
		
			System.out.println(k);
		}
	}

  }
}
