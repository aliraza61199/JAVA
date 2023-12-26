package A;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,2,3,1,4,5,};
			//	if(System.out.printf("hello world")==null)
			int count =0;	
		for(int i=0;i<=a.length;i++) {
			
		count=0;
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]) {
				count++;
				//if(a[i]!=)
				if(count==1) {
		
				System.out.println(a[i]);
				
				}
			}
		}
		}
	}
	}


