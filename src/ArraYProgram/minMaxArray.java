package ArraYProgram;

import java.util.Arrays;

public class minMaxArray {

	public static void main(String[] args) {
		int sum = 0;
		int count =0;
		int[] ar = {1,2,3,4,5,6,7,8,9};
		int i;
		for(int n:ar) {
		for( i=0;i<ar.length;i++) {
		       if(ar[i]+n==7) {
		    	   System.out.println("first Number "+n+" : "+"Second number "+ar[i]);
		       }
		    }
		}
	}
}
	
