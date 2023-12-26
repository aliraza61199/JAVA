package Grooming;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("print the value a");
		int a=sc.nextInt();
		int rem=0,sum=0;
		while (a>0) {
			
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
			
			//System.out.println(sum);
			
		}
		
		System.out.println(sum);

	}

	

	}


