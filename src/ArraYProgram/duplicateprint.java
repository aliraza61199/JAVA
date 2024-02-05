	package ArraYProgram;
	
	public class duplicateprint {
	public static void main(String[] args) {
		
		int[] ar= {2,3,7,6,3,4,6,4,1};
	    int count =0;
		for(int i=0;i<ar.length;i++) {
		    for(int j=i+1;j<ar.length;j++) {
		    	
		    	if(ar[i]==ar[j]) {
		    		System.out.println(ar[j]);

		    	}  		
		    }
	}
	}
	}
