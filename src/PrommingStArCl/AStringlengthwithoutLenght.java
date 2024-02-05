package PrommingStArCl;

public class AStringlengthwithoutLenght {

	public static void main(String[] args) {
		
		String st="find the length of string witout using length method";
		
		String[] st1= st.split(" ");
		int count=0;
		//int le = st.length();
		for(int j=st1.length-1;j<=0;j--) {
		System.out.println(st1[j]);
		}
		for(int i=0;i<st1.length;i++) {
			count++;
			//System.out.println(st1[j]);
		System.out.println(st1[i]);
		
		}
		System.out.println(count);
}
	}

