package ArrayClass;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int ar[]= {1,2,3,2,3,4,3,4,5};
		int cunt=0;
		int i,j;
		for(i=0;i<ar.length;i++) {
			
			//System.out.println("number"+i);
			for(j=0;j<ar.length;j++) {
				  if(ar[i]==ar[j]) {
					  break;
				  }
				}
			if(i==j) {
				System.out.println(ar[i]);
			}
				

			}
		}
		
	}

