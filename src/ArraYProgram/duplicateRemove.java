	package ArraYProgram;
	
	public class duplicateRemove {
	
		public static void main(String[] args) {
			
			int[] ar= {12,34,5,23,34,5,23,1,3,6,8,};
			
			int i,j;
			for(i=0;i<ar.length;i++) {
				
				for(j=i+1;j<ar.length;j++) {
					if(ar[i]!=ar[j]) {
					}
						System.out.println(ar[j]);
					}
				}
			}
		}
	
