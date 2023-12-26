package Section3;

 import java.util.ArrayList;
public class DemonstrationCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList a1=new ArrayList();
		a1.add("java");
		a1.add(102.22);
		a1.add(10);
		a1.add('t');
		System.out.println("the arraylist obj are a1"+a1);
		
		ArrayList a2=new ArrayList();
		a2.add(20);
		a2.add("SQL");
		a2.add('e');
		a2.add(12.233);
		
		System.out.println("the arraylist obj are  a2"+a2);
		    a1.addAll(a2);  //a1=a1+a2
		    System.out.println("after adding a2 to a1 is a1"+a1);
		    System.out.println("after Adding a2 to a1 is a2 "+a2);
		    
		    System.out.println("does a1 is  empty "+a1.isEmpty());
		    System.out.println("the size of the a2 is " +a2.size());
		    
		    System.out.println("to convert the Arraylist into the object array");
		    
		    Object[] obj =a2.toArray();
		    for (int i=0;i<obj.length;i++) {
		    	
		    	System.out.println(obj[i]);
	}
	a2.clear();
    System.out.println("after the clearing of a2 "+a2);
	
		    
		
	}

}
