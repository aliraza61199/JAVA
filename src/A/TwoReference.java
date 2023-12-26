package A;

public class TwoReference {

	 TwoReference(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	
		TwoReference a1=new TwoReference("s");
		TwoReference a2=new TwoReference("s");
		
		
		if(a2==a1)
		{
			System.out.println("words");
		}
		else
		{
			System.out.println("no words");
		}
		
		
		
	

	}

}
