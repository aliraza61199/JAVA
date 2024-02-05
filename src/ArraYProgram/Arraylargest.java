package ArraYProgram;

import java.util.Arrays;
import java.util.OptionalInt;

import com.google.common.base.Optional;

public class Arraylargest {

	public static void main(String[] args) {

		int[] ar= {2,5,7,9,11,12,17,21};
		for(int i=0;i<ar.length;i++) {
         Arrays.sort(ar);
		
         System.out.println(ar[0]+","+ar[2]);
	   OptionalInt max=Arrays.stream(ar).max();
	   int max1=max.getAsInt();
	System.out.println(max1);
		
		
		
		
		
		int max2=ar[0];
		for(Integer j:ar ) {
			if(max2<i) {
				max2=i;
				
			}
		}
		System.out.println(max2);
		
	}
}
}
