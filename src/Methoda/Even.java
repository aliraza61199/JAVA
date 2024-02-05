package Methoda;

import java.util.Arrays;

public class Even {

	public static void main(String[] args) {
		String s="123432";
        int []hj= {2,34,5,6}; 		//m1(n);
	    char[] result=m1(s);
		System.out.println(Arrays.toString(result));		
	}
	public static char[] m1(String s) {
		char[] arr=s.toCharArray();
		// 1   StringBuilder result=new StringBuilder();
		// 2 char result=' ';    /// single value aplicable dummy but multiple then
		char[] result=new char[arr.length];
		int i=0;
		for(char ch:arr) {
			if(ch=='2' || ch=='3' ) {
				
			}else {
				result[i]=ch;
				i++;
				// 2 result=ch;   // only for single value
			  // 1   result.append(ch+" ");
			}
		}
	// 2 return 
	// 1 return result;
		return result ;
	}
}
