package NumberQ;

//public class SunnyNumber {
//	public static void main(String[] args) {
//      int n=4;int count=0;
//      int num=n+1;
//      for(int i=1;i<=num;i++) {
//    	  if(num==(i*i)) {
//    		  count++;
//    	  }
//      }
//	if(count>0) {
//		System.out.println("Sunny Number");
//	}
//	else {
//		System.out.println("Not Sunny Number");
//	}
//	
//	}
//}

  public class sunnyNum {
	public static void main(String[] args) {
		int n=8;int count=0;
		int num= n+1;
		for(int i=1;i<=num;i++) {
			if(num==i*i) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("s.n");
		}
		else {
			System.out.println("not s.n");
		}
	}
}