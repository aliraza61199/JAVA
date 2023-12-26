package Section3;
	   import java.util.ArrayList;
	public class OddIntegerArray {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   ArrayList Z=new ArrayList();
	      Z.add(53);
	      Z.add(15.2);
	      Z.add(145.25);
	      Z.add(463);
	      Z.add(97);
	      Z.add("Tiger");
	      
	      System.out.println("the Arraylist  obj  are "+Z);
	       for (int i=0;i<Z.size();i++) {
	    	   Object obj =Z.get(i);
	    	   if (obj instanceof Integer) {
	    		   Integer odd=(Integer )obj;
	    		   if (odd%2==1) {
	    			   System.out.println(odd);
	    		   }
	    	   }
	    		   
	       }
	       
		}

}
