package B;

public class Subject1 {

	// TODO Auto-generated method stub

		public void startReading (Topic t)
		{
			t.understand();
			
		}
		public static void main(String[] args) {
			Topic t= new Topic ();
			Subject1 s=new Subject1();
			s.startReading (t);
	}

}
