package GulamBhai;

public class count_integer {
public static void main(String[] args) {
	int n=2133214;
	String s=String.valueOf(n);
	char[] ar=s.toCharArray();
	int i , count = 0;
	for( i=0;i<ar.length;i++) {
      count++;
	}
	System.out.println("count of array :- "+count);

	 //another way
	int num=0;
	while(n!=0) {
		n=n/10;
		num++;
	}
	System.out.println("by using while loop count : - "+num);
  }
}
