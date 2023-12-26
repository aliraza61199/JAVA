	package StringClasses;
	
	import java .util.LinkedHashSet;
	import java.util.Iterator;
	
	public class   SpcialCharacter  
	
	{
	
		public static void main(String[] args) {
			
			String s= "MOHANA123@***";
			String s1=" ";
			
			LinkedHashSet a1=new LinkedHashSet();
			
			for (int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				
				if (!(s.charAt(i)>='A'&& s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)>='9'))
				{
				
					a1.add(ch);
					
					{
				//else
			}
		}
			System.out.println(ch);
		}
		
			
			

	}

}
