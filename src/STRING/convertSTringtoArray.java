package STRING;

public class convertSTringtoArray {

	public static void main(String[] args) {
		
		String s= "1 2 3 4 5 "; //1 2 3 4 5 
		char[] arr= s.toCharArray();
		int[]  set=new int[arr.length/2] ;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				 set[i-j]=arr[i];
				 j++;
			}
		}
	
		for(int i=0;i<set.length;i++) {
//			int fill=a[i];
//			int n2=fill-48;
			System.out.println(set[i]-48);
		}
//		int n= Integer.parseInt(s);
//		double d = Double.parseDouble(s);
//		float f= Float.parseFloat(s);
//		long l= Long.parseLong(s);
//		short sort= Short.parseShort(s);
//		boolean b= Boolean.parseBoolean(s);
//		byte bt= Byte.parseByte(s);
		
	}
}
