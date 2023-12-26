package STRING;

public class FirstletterCapital {

	public static void main(String[] args) {

		String s = "my name is ali raza";
		char[] cha=s.toCharArray();
		boolean space=true;
		
		for(int i=0;i<cha.length;i++) {
			if(Character.isLetter(cha[i])) {
				if(space) {
					cha[i]=Character.toUpperCase(cha[i]);
					space =false;
				}
			}
			else {
				space=true;
			}
			s=String.valueOf(cha);
		}
		System.out.println(s);
		
	}

}
