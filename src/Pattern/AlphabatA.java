	package Pattern;
	import java.util.Scanner;
	
	public class AlphabatA {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("enter the rows");
			
			int r=sc.nextInt();
			System.out.println("enter the colums");
			int c=sc.nextInt();
			
			for (int i=1;i<=r;i++) 
			{
				for (int j=i+1;j<=r;j++) 
				{
					//if ((i==1&&j!=r)||(i!=1&&j==1)||(i!=1&&j==c)||(i=(r/2)+1))//wronge condition
					System.out.println("A");
			
					//else
					{
						//System.out.println(" ");
						
					}
					 System.out.println( );
				}
			}
	
		}
	
	}
