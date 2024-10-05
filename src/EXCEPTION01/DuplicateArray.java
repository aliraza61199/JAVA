package EXCEPTION01;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {

		int ar[] = {3,5,3,2,7,4,8,2,8,9};
		
		Set<Integer> set=new HashSet<>() ;
	
		System.out.println("duplicate ");
		for (int i=0;i<ar.length;i++) {
			
			for (int j=i+1; j<ar.length;j++)
			{
				if  (ar[i]==ar[j]) {
					
					System.out.println(ar[i]);
				}
			}
		}
		 
		// Using method for remove Duplicate 
		
		System.out.println("ascending order with duplicate remove :- ");
		for (int i=0;i<ar.length;i++) {
          set.add(ar[i]);
		}
          for(int asc:set) {
       System.err.println(asc);
}
		
	}

}
