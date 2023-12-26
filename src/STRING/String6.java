package STRING;

public class String6 {

	public static void main(String[] args) {
		String s= "how are you";
		String s1="";
		 String s2="";
		String[] arr=s.split(" ");//[how] [are] [you]
		for(int i=0;i<arr.length;i++) {
			s1="";
                 s1=s1+arr[i];
                 for(int j=s1.length()-1;j>=0;j--) {
                	s2=s2+s1.charAt(j);
                 }
			s2=s2+" ";
	}
System.out.println(s2.toUpperCase());
	
  for(int k=s2.length()-1;k>=0;k--) {
  }
	  System.out.println(s2);
  }
	}

