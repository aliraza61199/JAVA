package NeeewCllasss;

import java.util.HashMap;
import java.util.Map;

public class DuplicateremoveLooping {

	public static void main(String[] args) {

		//int[] arr= {2,5,1,3,4,6,7,2,5,1,3,4,6,7};
		String name="maa papa maa chacha tau maa papa fuffi maa papa";

	     int count = 1;                              
		String[] arr=name.split(" ");
		Map<String ,Integer> map=new HashMap<String,Integer>();
		for(String s:arr) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String, Integer> result : map.entrySet()) {
			if(result.getValue()>1) {
				System.out.println(result.getKey()+" : "+result.getValue()+" Total Number");
			}
		}
		
		String s="1234";
		int a=Integer.parseInt(s);
		System.out.println(a/2);
		char c='5';
		int a1=c-0;
		System.out.println(a1/5);
//		
//		//char[] arr=s.toCharArray();
//		int i,j;
//		for(i=0;i<arr.length;i++) {
//			for(j=0;j<arr.length;j++) {
//				count++;
//				if(arr[i].equals(arr[j])) {
//				break;	
//				}
//			}
//		if(i==j) {
//			System.out.println(arr[i]+" "+count);
//		}
//		
//		
//		}
	}

}
