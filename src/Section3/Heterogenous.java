package Section3;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Heterogenous {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Z=new ArrayList();
		Z.add(68);
		Z.add(6.5);
		Z.add(48);
		Z.add(15.4);
		Z.add("selenium");
		Z.add(51);
		int count =0;
		
		System.out.println("the arraylist obj are "+Z);
		for (int i=0;i<Z.size();i++) {
			Object obj =Z.get(i);
			if (obj instanceof Double ) {
				
		    System.out.println(obj);
		
			}
			else if (obj instanceof Character) {
				count++;
				System.out.println("the number of character "+count);
			}

	   }

    }
}
