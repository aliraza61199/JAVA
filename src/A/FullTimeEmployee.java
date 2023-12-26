	package A;
	
	public class FullTimeEmployee  extends Employee 
	{
	public FullTimeEmployee (String name, int paymentPerHour )
	{
		super (name ,paymentPerHour );
	}
	//@overrride
	public int calculateSalary() {
		 return getPaymentPerHour()* 8;
	}
	}
