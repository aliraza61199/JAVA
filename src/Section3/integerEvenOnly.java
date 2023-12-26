package Section3;
     import java.util.ArrayList;
public class integerEvenOnly {
           
	//private static Character obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList Z=new ArrayList();
         
         Z.add("Java");
         Z.add("Girl");
         Z.add(45);
         Z.add('k');
         Z.add(12.22);
         
         
         System.out.println("the Arraylist obj are"+Z);
             for (int i=0;i<Z.size();i++) {
            	 Object obj =Z.get(i);
            	 
            	 if (obj  instanceof String) {
            		 
            		 System.out.println(obj);
            	 }
             }
         
	}

}
