package EXCEPTION01;

import java.util.Scanner;
	public class  ArrayAsc
	{
		public static void main(String[] args) 
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		 int size=sc.nextInt();
		 int ar[]= new int[size];
		 System.out.println("Enter the Element of an Array");
		 for(int i=0;i<size;i++) {
			  ar[i]= sc.nextInt();
		 }
		 for(int i=0;i<size;i++) {
           for(int j=i+1;j<size;j++) {
        	   if(ar[i]>ar[j]) {
        		   int temp=ar[i];
        		   ar[i]=ar[j];
        		   ar[j]=temp;
        	   }
           }
           System.out.println(ar[i]);
		 }
		 
		}
	}
	
	
	
