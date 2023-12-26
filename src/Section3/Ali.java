package Section3;

public class Ali {
	
	
	//global variable  int a=10;              1
	public static void main(String[] args) 
	{
		
		//local variable  int a =29;          1
	}
	
	public Ali()
	{
		
		//global variable int a=9;            0
	}
	
	public static void m1() 
	{
		//local variable int a=10;            1
	}
	
	static 
	{
		//global variable int a=89;           0
	}
	
	{
		//global variable int a=78;           0
		// 50%
	}

}
