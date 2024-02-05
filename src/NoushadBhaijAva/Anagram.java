	package NoushadBhaijAva;

import java.util.Arrays;

public class Anagram {
	 public static void main(String[] args) {
		
		 char[] ar= {'a','b','c','d','e','c'};
		 char[] arr= {'d','e','f','a','b','c'};
		int index=0;
		 for(char c:ar) {
			 if(c!='c') {
				 ar[index++]=c; 
			 }
			
		 }
		 if(index<ar.length) {
			 ar[index++]='c';
		 }
		 System.out.println(Arrays.toString(ar));
		 
		 
		 
		 
		 
		 
//		 char[] newarr=new char[ar.length+arr.length];
//		 int i=0;
//         for(char a:ar) {
//        	 newarr[i++]=a;
//         }
//		 for(char a1:arr){
//			 newarr[i++]=a1;
//		 }
//		 
//		 System.out.println(Arrays.toString(newarr));
		 
		 
		 
		
		 Arrays.sort(ar);
		 Arrays.sort(arr);
		 String str1=String.valueOf(ar);
		 String str2=String.valueOf(arr);
		 if(str1.equals(str2)) {
			 System.out.println("It is equal or Anagram :"+str1);
		 }else {
			 System.out.println("Sorry Not Equals");
		 }
		 System.out.println(Arrays.equals(ar, arr));
		System.out.println(Arrays.compare(ar, arr));
		 
	}
	}
