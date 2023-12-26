package ARray;

import java.util.Arrays;

public class arr4gulam {
	
	public static void main(String[] args) {
		int ar[]= {799,9,96,4,4,78,54,333};
//		int max = ar[0];
//		for(int i=0;i<ar.length;i++) {
//			    if(max <ar[i]) {
//				max=ar[i];
//		     }
//		}
//		//System.out.println(max);
//	int max2=ar[0];
//	for(int i=0;i<ar.length;i++) {
//		 if(max !=ar[i] && max2<ar[i]) {
//		        max2=ar[i];
//		     }
//       }
//
//	int max3=ar[0];
//	for(int i=0;i<ar.length;i++) {
//		if(max !=ar[i] && max2 !=ar[i] && max3<ar[i]) {
//			System.out.println("check : "+max3);
//		       max3=ar[i];
//	        }
//		}
//	      System.out.println(max3);

		Arrays.sort(ar);
		int maxNum=ar[ar.length-1];
		int secMax=0;
		int thirdMax=0;
		
		for(int i=ar.length-2;i>0;i--) {
			if(ar[i]<maxNum) {
				secMax=ar[i];
				break;
			}
		}
		for(int j=ar.length-3;j>0;j--) {
			if(ar[j]<secMax) {
				thirdMax=ar[j];
				break;
			}
		}
		System.out.println("First highest number is: "+maxNum);
		System.out.println("Second highest number is: "+secMax);
		System.out.println("third highest number is: "+thirdMax);
		
		
	}
}
