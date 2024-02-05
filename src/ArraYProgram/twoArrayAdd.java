	package ArraYProgram;

import java.util.Arrays;

public class twoArrayAdd {
	public static void main(String[] args) {
		
		int[] ar= {2,4,5,7,8,9};
		int[] arr= {1,3,6,4,7,4};
	int	a=ar.length;
	int a1=arr.length;
		int[] ary=new int[a+a1];
		Arrays.copyOf(ary, a);
		Arrays.copyOf(ary, a1);
		System.out.println(Arrays.toString(ary));
		}
	}
	
