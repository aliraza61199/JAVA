package Secssion1;
 import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;  
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}

		String s="i am good";
	    String[] arr=s.split(" ");
	    String s1="";
	    for(int i=0;i<arr.length;i++)
	    {
	    	s1=s1+arr[i]+"a"+" ";
	    }
		System.out.println(s1);
		
		int[] a1= {0,1,0,1,1,0,0};
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j]) {
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
			System.out.print(a1[i]+" ");
			
			
		}
		System.out.println("");
	ArrayList a2=new ArrayList();
	a2.add(0);
	a2.add(1);
	a2.add(1);
	a2.add(1);
	a2.add(0);
	Collections.sort(a2);
	System.out.println(a2);
	
		
	}

}
