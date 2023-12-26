package STRING;

public class Stringalpha {

	public static void main(String[] args) {

		String s="Exce5pt4ion23";
		String s1="",s2="";
		int count=0,count1=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count++;
				s1=s1+s.charAt(i);
			}
			else {
				s2=s2+s.charAt(i);
				count1++;
			}
		}
	System.out.println(s1+"    "+count);
	System.out.println(s2+"     "+count1);
	}

}
