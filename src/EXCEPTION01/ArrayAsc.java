package EXCEPTION01;

import java.util.Scanner;
	public class  ArrayAsc
	{
		public static void main(String[] args) 
		{
			//Scanner sc=new Scanner (System.in);
			System.out.println("enter the size of an array:");
//			int size=sc.nextInt();
//			int a []=new int[size];
			int a[]= {2,4,6,8,0};
	       System.out.println ("enter the  array elements :");
			 for (int i=0;i<a.length;i++ )
			 {
				// a[i]=sc.nextInt();
		 System.out.println(" the array elements are:");
			 for (int j=i;j<a.length ;j++)
			 {
				 if (a[i]>a[j])
				 {
					 int temp=a[i];
					  a[i]=a[j];
					 a[j]=temp;
				 }
			 }
	            System.out.println(i);
			 }
		}
	}
	
	
	
