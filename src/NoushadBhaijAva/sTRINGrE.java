package NoushadBhaijAva;

public class sTRINGrE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "i am go";
		 String s1= "";
		 String[] arr = s.split(" ");
		 String s2= "";
		 for (int i=0;i<arr.length;i++) {
					 s1="";
					 s1= s1+arr[i];
					 for (int j=s1.length()-1;j>=0;j--) {
		                	s2=s2+s1.charAt(j);
					 }
					 s2=s2+" ";
		 }
		 System.out.print(s2);
		 }
	}
	

