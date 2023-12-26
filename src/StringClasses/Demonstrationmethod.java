package StringClasses;

public class Demonstrationmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String Z= "ishika";
		String Z1="GAJALA";
		String Z2="Hi how are you  Dear";
		
		
		System.out.println("to find the length of the Z1 "  +Z1.length());
	
		System.out.println("to retrieve the char from the String Z1");
		
		
		for (int i=0;i<Z1.length();i++)
		
		{
			System.out.println(Z1.charAt(i));
			
		}
			System.out.println("to convert the String into the char array ");
			
			char []ch=Z.toCharArray();
		
			
			for (int i=0; i<ch.length;i++) 
			
			{
				System.out.println(ch[i]);
			}
				
				System.out.println("to find the index of Z " +Z.indexOf('i'));
				
				System.out.println("to find the last index of Z " +Z.indexOf('a'));
				
				System.out.println("to print sustring from index1 " +Z.substring(1)  );
				
				System.out.println("");
			}
		}
	



