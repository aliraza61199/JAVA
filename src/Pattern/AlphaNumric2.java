package Pattern;

public class AlphaNumric2 {

	public static void main(String[] args) {
		
	
		int n=6;
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) {
		 
			System.out.print("HAPPY  ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("birthday ");
			}
			System.out.println();
		}
	
		for(int i=n; i>=1;i--) {
			for(int j=n;j>=i+1;j--) {
		 
			System.out.print("MAhira ");
			}
			System.out.println();
	}
}
}

