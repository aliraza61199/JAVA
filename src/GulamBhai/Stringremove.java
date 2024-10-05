package GulamBhai;

public class Stringremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "we.are.the.people.of.india";
		    String[] sp =s.split("[.]");
		    String result="";
		    for(int i=0;i<sp.length;i++) {
		    	result=result+sp[i]+" ";
		    }
		    
           System.out.println(result);
	}

}
