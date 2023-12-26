	package Pattern;
	import java.util.Scanner;
	
	public class AlphaNumric {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println(" enter the rows");
			int r=sc .nextInt();
			
			
			System.out.println("enter the colums");
			
			int  c=sc.nextInt();
			char ch='A';
			int n=1;
			
			for (int i=1;i<=r;i++) {
				for (int j=1;j<=r;j++) {
					
					System.out.print((n++)+" ");
					
					System.out.print((ch++)+" ");
				}
				System.out.println( );
				}
			}
	
		}
	
	//OUTPUT
	
  //1 A 2 B 3 C 4 D 5 E 
 //6 F 7 G 8 H 9 I 10 J  
 //11 K 12 L 13 M 14 N 15 O 
 //16 P 17 Q 18 R 19 S 20 T 
//21 U 22 V 23 W 24 X 25 Y 