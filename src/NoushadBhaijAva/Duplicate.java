package NoushadBhaijAva;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {  // is not applicable for more then double not work
	
	public static void main(String[] args) {
		
	int[] ar= {2,3,4,5,6,4,5,6};
	
	for(int i=0;i<ar.length;i++) {
		  for(int j=i+1;j<ar.length;j++) {
			  if(ar[i]==ar[j]) {
					System.out.println(ar[i]);
			  
break;
			  }}
		  }
	
//	List<Integer> a1 = new ArrayList<>();
//	for(Integer i:ar) {
//		if()
//	a1.add(ar);
//	
	}
}
