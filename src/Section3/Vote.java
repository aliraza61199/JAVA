	package Section3;
	import java.util.Scanner;
	
	public class Vote
	{
	
		public static void main(String[] args) {
			
	System.out.println("voting Started");
	Scanner sc=new Scanner (System.in);
	
	System.out.println("enter the age ");
	int age =sc.nextInt();
	
	
	if (age>=18)
	{
		System.out.println("eligible to vote");
	}
	
		else 
		{
			try {
				throw new NotEligibleToVoteException();
			}
			catch (NotEligibleToVoteException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Voting Closed");
		
			}
	}
		}
	
	
