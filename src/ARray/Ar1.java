package ARray;

import java.util.Arrays;

public class Ar1 {

	public static void main(String[] args) {
		
	int ar[]= {3,4,9,1};
	//Arrays.sort(ar);
	System.out.println("sort number:");
	
	for(int i=0;i<ar.length-1;i++) {
		
		for(int j=i;j<ar.length;j++) {
			if(ar[j-1]<ar[j]) {

		System.out.println(ar[i]);
		
		}
		}
	}
	}
}

			//import java.util.Arrays;
			//
			//public class SortArrayExample {
			//    public static void main(String[] args) {
			//        int[] array = { 90, 23, 5, 109, 12, 22, 67, 34 };
			//        Arrays.sort(array);
			//        System.out.println("Elements of array sorted in ascending order: ");
			//        for (int i = 0; i < array.length; i++) {
			//            System.out.println(array[i]);
			//        }}}
