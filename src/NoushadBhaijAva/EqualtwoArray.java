package NoushadBhaijAva;

import java.util.Arrays;

public class EqualtwoArray {

	public static void main(String[] args) {

		int[] ar=  {1,2,3,4,5,6};
		int[] arr= {4,5,6,7,8,9};
		
		
		Arrays.sort(ar);
		Arrays.sort(arr);
		String ar1= String.valueOf(ar);
		String ar2=String.valueOf(arr);
        if(ar1.equals(ar2)) {
		System.out.println("true"+ar1);
        }else {
        	System.out.println("false");
        }
        System.out.println(Arrays.equals(ar, arr));
	}

}
