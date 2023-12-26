package NeeewCllasss;

public class wordShorting { 

	public static void main(String[] args) {
      // int[] arr= {3,6,1,9,4,7,4};
		String s="vgv bjhbg jb cyjtfr xas zsx abc";
		String[] arr= s.split(" ");//[vgv][bjhbg]
      String tem ;
       for(int i=0;i<arr.length;i++) {
    	 
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i].compareTo(arr[j])>0 ) {
    			   tem=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=tem;
    	   }
    	   }
    	   
       }
       for(int i=0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
       }
	}
}
	

