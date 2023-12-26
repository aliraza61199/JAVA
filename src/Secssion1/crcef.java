package Secssion1;
import java.util.Scanner;
public class crcef {




public static void main (String args[]){
int i,j,k=1;
int letter=64;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of rows: ");

int rows=scan.nextInt();
System.out.print("\nYour pattern here\n\n");
for(i=1; i<=rows; i++){
  for(j=1; j<=i; j++,k++){
  System.out.print((char)(k+letter));
}

System.out.println();
}
}
}