package NumberQ;

import java.util.Scanner;

public class HappyNum {
	public static void main(String[] args) {

		
			Scanner	sc= new Scanner(System.in);
			System.out.println("enter the num");
			int n= sc.nextInt();
			happyNum(n);
		}
		
			public static void happyNum(int n) {

				int rem=0,sum=0;
				if(n==7) {
					System.out.println("happy num");
				}
				else {
					while(n>9){
						while(n>0) {
							rem=n%10;
							sum= sum+(rem*rem);
							n=n/10;
						}
						n=sum;
						sum=0;
					}
					if(n==1) {
						System.out.println("happy num");
					}
					else {
						System.out.println("not happy num");
					}
				}		}	
	}

