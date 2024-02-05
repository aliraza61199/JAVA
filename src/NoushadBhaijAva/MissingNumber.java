package NoushadBhaijAva;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
	char[] arr= {'a','c','f','e','h','i'};
	ArrayList<Character> a1=new ArrayList<>();
	for(char store:arr) {
		a1.add(store);
	}
//	//int lastnumber=Arrays.stream(n).max().getAsInt();
//	int lastnumber=n[n.length-1];
	
	

	
	char lastnumber=arr[arr.length-1];
	for(char ch='a';ch<lastnumber;ch++) {
		    if(!a1.contains(ch)) {
			  System.out.println(ch);
			}
		
	}
	
				
	 }
	}

