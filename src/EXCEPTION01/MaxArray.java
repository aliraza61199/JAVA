package EXCEPTION01;

import java.util.Scanner;
 public class  MaxArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of an array:");
		int size=sc.nextInt();
		int a []=new int[size];
		int large =a[0];
       System.out.println ("enter the  array elements :");
		 for (int i=0;i<size ;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 
	
		 for (int i=0;i<size ;i++)
		 {
			if (a[i]>large)
			{
				large=a[i];
			}
          
		 }	
		System.out.println("the large element is :- "+large);
	}
}
		


