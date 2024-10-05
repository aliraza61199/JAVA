package Pattern;

public class Pyramid {
	
	public static void main(String[] args) {
		
	
	int n=5, z=1 ; 
	
		

	for(int i=1;i<=n;i++) {
		for(int j=n-1;j>=i;j--) {
			
		
		System.out.print(" ");
	}
	for(int k=1;k<=z;k++) {
		System.out.print(k);  //if we r use (k) 1 123 1234 12345 123456   and (z) 1 333 55555 7777777  and use (i) 1 222 33333 
	}
	z+=2;
	System.out.println();
}
	}
}
