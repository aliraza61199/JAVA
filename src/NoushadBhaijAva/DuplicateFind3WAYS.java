package NoushadBhaijAva;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFind3WAYS {
  public static void main(String[] args) {
	 
	 
/*	 for(int i=0;i<arr.length;i++) {
		 int count=1;
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j] && arr[i]!=' ') {
				 arr[j]=' ';
				 count++;
			 }
		 }
	 if(count>1 && arr[i]!=' ') {
		 System.out.println(arr[i]);
	 }
	 }*/
	 ////////////////// second /////////////////
	 
	/* Map<Integer,Integer> map=new HashMap<Integer,Integer>(); 
	 for(int i:arr) {
		map.put(i, map.getOrDefault(i, 0)+1);
		
	 }
	 for(Map.Entry<Integer, Integer> result:map.entrySet()) {
		 if(result.getValue()>1) {
			 System.out.println(result.getKey()+" : "+result.getValue()+" times");
		 }
	 }*/
	  int[] arr= {1,3,5,4,4,5,5,4,4,5,6,8,6};
	 Map<Integer,Integer> map=new HashMap<Integer,Integer>(); 
	 for(int i:arr) {
		Integer val=map.get(i);
		if(val==null) {
			map.put(i, 1);//1=1,3=1,5=1,4=1,
		}else {
			map.put(i, val+1);//4=2,5=3
		}
		
	 }
	 for(Map.Entry<Integer, Integer> result:map.entrySet()) {
		 if(result.getValue()>1) {
			 System.out.println(result.getKey()+" : "+result.getValue()+" times");
		 }
	 }
	 
	 
  }
}
