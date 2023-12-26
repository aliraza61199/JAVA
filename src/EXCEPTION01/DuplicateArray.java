package EXCEPTION01;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {3,5,3,2,7,4,8,2,8,9};
		
		
		for (int i=0;i<ar.length;i++) {
			
			for (int j=i+1; j<ar.length;j++)
			{
				if  (ar[i]==ar[j]) {
					
					System.out.println(ar[i]);
				}
			}
		}

	}

}
