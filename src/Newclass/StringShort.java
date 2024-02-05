package Newclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringShort {

	public static void main(String[] args) {
		String st= "zcxv bfvd abgvd rtfh";
           String[] arr=st.split(" ");
           Arrays.sort(arr);
           TreeMap<String,Integer> map= new TreeMap();
           TreeSet<String> result= new TreeSet<>();
           ArrayList<String> a1=new ArrayList<>();
           System.out.println("------------------------1st---------------");
           for(String ali:arr) {
        	   System.out.println(ali);
        	   a1.add(ali);
        	   result.add(ali);
        	   map.put(ali, map.getOrDefault(ali, 0)+1);
           }
		Collections.sort(a1);
		System.out.println("------------------------2nd---------------");
	     for(String s1:a1) {
	    	 System.out.println(s1);
	     }
	     System.out.println("------------------------3rd---------------");
	     for(String s2:result) {
	    	 System.out.println(s2);
	     }
	     String temp="";
           for(int i=0;i<arr.length;i++) {
        	   for(int j=i+1;j<arr.length;j++) {
        		   if(arr[i].compareTo(arr[j])>0) {
        			   temp=arr[i];
        			   arr[i]=arr[j];
        			   arr[j]=temp;
        		   }
        	   }
           }
           System.out.println("------------------------4th---------------");
           for(int i=0;i<arr.length;i++) {
        	   System.out.println(arr[i]);
           }
           System.out.println("------------------------5th---------------");
           for(Map.Entry<String , Integer> h:map.entrySet()) {
        	  System.out.println(h.getKey());
           }

	}
}
