package STRING;

public class S91stletterCapital {

	public static void main(String[] args) {
		
		String str= "my name is ali raza";
		//String str1= " ";
		char[] car = str.toCharArray();
	    boolean Space = true;

		for(int i=0;i<car.length;i++) {
//		System.out.println(str.charAt(i));
//		}
//		int a=10,b=20;
//		System.out.println(a+b);
//		System.out.println(Thread.activeCount());
		      if(Character.isLetter(car[i])) {
		    	  
		    	  if(Space) {
		              car[i] = Character.toUpperCase(car[i]);
		              Space =false;
		              }
		      }
		              else {
		            	  Space=true;  
		              }
		    	  str=  String.valueOf(car);		  
		   }
		System.out.println("Message: " + str); 
	}
}
	