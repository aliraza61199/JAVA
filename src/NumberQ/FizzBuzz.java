package NumberQ;

public class FizzBuzz {

	public static void main(String[] args) {

		int  n= 16  ;
	    int a=3, b= 5;
	    if ((n%a==0)&&(n%b==0)){
	    	
	    	System.out.println("fizzbuzz");
	    }
	    else if(n%a==0){
	    	System.out.println("fizz");
	    }
	    else if(n%b==0) {
	    	System.out.println("buzz");
	    }
	    else {
	    	System.out.println("no matching element");
	    }
		
	}

}
