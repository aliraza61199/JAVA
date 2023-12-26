package Section3;

public class SumAverageException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {23,12,34,54,65,75,61};
   int sum =0, avg=0;
   try {
	   for (int i=0;i<a.length;i++)
		   sum=sum+a[i];
	   avg=sum/a.length;
	   System.out.println(sum +" "+avg);
   }
   catch (ArrayIndexOutOfBoundsException w)
   {
	   System.out.println(w.getMessage());
	}
	}

}
