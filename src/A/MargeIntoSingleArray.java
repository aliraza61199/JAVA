package A;

public class MargeIntoSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10}; 
		
		int a1=a.length;
		int b1= b.length;
		int c1=a1+b1;
		
		
		int c[]= new int[c1];
		
		
//		for(int i=0;i<=a.length;i++) {
//			
//			c[i]=a[i];
//		}
		
		for(int i=0; i<b.length;i++) {
			
			c[a1+i]=b[i];
				
			}
		
			for(int i=0;i<c.length;i++) {
				
				System.out.println(c[i]);
			}
		}
		

	}


