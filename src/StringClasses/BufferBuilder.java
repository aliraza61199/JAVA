package StringClasses;

public class BufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer  Z=new StringBuffer("manUAL");
		
		Z.append(" Class A")	;
		
		System.out.println("the Stringbuffer Z " + Z);
		
		StringBuilder Z1=new StringBuilder("JavaScript");
		
		Z1.append(" Class B");
		
		System.out.println("the StringBuilder Z1 " +Z1);
		
		String Z2=new String("MY SQL");
	
		Z2.concat(" CLASS C");
		
		System.out.println("the String Z2  " +Z2);
	}

}
