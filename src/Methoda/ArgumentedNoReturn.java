package Methoda;

public class ArgumentedNoReturn {

	public static void main(String[] args) {

		String s="Argumentes And No ReturnType";
			m1(s);
			int num=145;
			int n12=m2(num);
			System.out.println(n12);
	}
	public static void m1(String s) {
		System.out.println(s);
	}
	public static int m2(int n) {
		int n1=n/2;
		return n1;
	}

}
