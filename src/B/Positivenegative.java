package B;

import java.util.Scanner;

public class Positivenegative {

	public static void main(String[] args) {
	
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		num =sc.nextInt();
		if(num>0) {
			System.out.println("+ve Num:"+num);
		}
		else if(num<0) {
			System.out.println("-ve Num"+num);
		}

	}

}
