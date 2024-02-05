package ArraYProgram;

public class sumofArry {  //average

	public static void main(String[] args) {

		int sum=0 , count =0;
		int[] ar= {2,4,65,4,35,7,76,8,42,9};
		for (int i=0;i<ar.length;i++) {
			sum= sum+ar[i];
			count++;
			System.out.println(ar[i]+"+"+sum+"="+sum+"+"+ar[i]);
		}
			System.out.println("Average of given array :- " +sum/count);
			
	}
}
