package Pattern;

public class PyramidPattern {
    public static void main(String[] args) {
        String s = "Happy Birthday Bhaiya";
        
      char[] ar=  s.toCharArray();
      
      for(int i=0;i<=ar.length;i++) {
    	  for(int j=i;j<=ar.length;j++) {
    		  System.out.print(ar[i]);
    	  }
    	  System.out.println();
      }
    }
}
