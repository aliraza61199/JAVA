package NeeewCllasss;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList a= new ArrayList();
		a.add(24);
		a.add(4.5);
		a.add("ALI");
		a.add('S');
		a.add(null);
		System.out.println("object A " +a);

		ArrayList b= new ArrayList();
	   b.add("water");
	   b.add(true);
	   b.add(null);
	   System.out.println("object B "+b);

	   b.addAll(a);
	   System.out.println(b);
	   System.out.println(a.contains('S'));
	   System.out.println(b.containsAll(a));
	   a.remove(1);
	   System.out.println("object a " +a);
	   
	   a.remove("ALI");
	   System.out.println(a);
	   b.add("Ali");
	   
	   b.removeAll(a);
	   System.out.println(b);
	   
	   ArrayList A1= new ArrayList();
	   A1.add("new");
	   A1.add("my selection");
	   A1.add(456);
	   A1.add(null);
	   System.out.println("Object A1 "+A1);
	   A1.addAll(b);
	   System.out.println(A1);
	   A1.retainAll(b);
	   System.out.println("Object of A1"+A1);
	}

}
