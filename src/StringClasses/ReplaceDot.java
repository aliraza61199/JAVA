package StringClasses;

public class ReplaceDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " the.killer.boy  ";

//		System.out.println("String : " +s);
//		
//		int pos = 3  ;
//		
//		char rep= ' ' ;
//		
//
//		String res = s.substring(3)+ rep+s.substring(pos+1 ) ;
//		System.out.println(res);
		//'''''''''''''''''''''''''''''''''''''''''''''//
//		int count = 0;
//		String s1 = "";
//		String s2 = "";
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '.') {
//				count++;
//			}
//
//		}
//		int j = 1;
//		System.out.println(count);
//
//		String[] arr = s.split("[.]");
//		for (int i = 0; i < arr.length; i++) {
//
//			if (j <= 2) {
//				s1 = s1 + arr[i] + ".";
//				j++;
//
//			} else {
//				s1 = s1 + arr[i];
//				j++;
//			}
//
//		}
//		System.out.println(s1);
		//-------------------------------------------------//
		
		String[] arr=s.split("[.]");
		String s1="";
		for(int i=0;i<arr.length;i++)
		{
			s1=s1+arr[i]+".";
		}
		
		System.out.println(s1);
	}

}
