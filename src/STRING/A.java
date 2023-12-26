package STRING;

class A    //exception
{
	public static void main(String[]args) {
		System.out.println("start");
		try{
		System.out.println("i am try block start");
		int sum=0;
		int a=0,b=20;
		int Sum = b/a;
		System.out.println(sum);
		System.out.println("i am try block end");
		}
		catch(Exception e){
		System.out.println("i am catch block start");
		System.out.println(e.getMessage());
		System.out.println("i am catch block end");
		}
		finally{
		System.out.println("close data base connection");
		}
		System.out.println("i am main ends");
	}
}
