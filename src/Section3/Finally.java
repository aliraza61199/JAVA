	package Section3;
	
	public class Finally {
	
		public static void main(String[] args) {
		
	  System.out.println("Payment Stsrted");
	  
	  System.out.println("Account Opened");
	  
	  System.out.println("Payment Mode");
	  
	  try { 
		  System.out.println(10/0);
		  
		  
	  }
	  finally
	  {
		  System.out.println("Acount Closed");
		  
		  System.out.println("Payment Done");
	  }
		}
	
	}
