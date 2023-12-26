package ArrayClass;

public class duplicateR {

	public static void main(String[] args) {
		
		int ar[]= {1,3,4,2,3,4,3,4,5};
		int i,j;
		
		for(i=0;i<ar.length;i++) {
			
			for(j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
		
			 System.out.println(ar[j]);
			}
	}
}
}
}