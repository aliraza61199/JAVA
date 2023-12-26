	package StringClasses;
	import java.util.Scanner;
	
	public class SpaceInSentance {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
			int count =0;
			
			
			System.out.println("enter the String ");
			
			String S=sc.nextLine();
			
			for (int i=0;i<S.length();i++)
			{
				
				if (S.charAt(i)==' ')
				{
					count++;
				}
					
				}
				System.out.println("the total number of space are  " +count);
			}
			
	
		}
	
	
