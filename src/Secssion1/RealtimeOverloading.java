package Secssion1;

public class RealtimeOverloading {
	
	
	public static int sub(int a, int b) {
		 return  a-b;
	}
	public static int Add(int a, int b, int c) {
		return  a+b+c;
	}
	public static double Add(int a,int b,double d) {
		return a+b+d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealtimeOverloading Q=new RealtimeOverloading();
		System.out.println("subtract  the two number " + Q.sub (45, 37));
		System.out.println("Addition of two number " + Q.Add (12,39, 54));
		System.out.println("addition of three number with decimalvalue " + Q.Add(48, 51, 12.24));
		

	}

}
