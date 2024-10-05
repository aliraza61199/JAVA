package NeeewCllasss;

import org.junit.Test;

public class Static_NonStatic {

	static int a=10;
	 static int b=30;
	
	 int c=4;
	 public static void main(String[] args) { 
		System.out.println("main meyhod");
		m2();
		Static_NonStatic a1=new Static_NonStatic();
		a1.m1();
		 
	}
	public void m1() {
		System.out.println("Non Static method");
	}
	{
		System.out.println("Non Static Block");
	}
	 	 public Static_NonStatic() {
	 		 System.out.println("Constructor");
	 	 }
	 	public static void m2() {
			System.out.println(" Static method");
		}
		static
	 	{
			System.out.println(" Static Block");
		}
	 }


//output 
//Static Block
//main meyhod   
// Static method
//Non Static Block
//Constructor
//Non Static method


