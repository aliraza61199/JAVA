package EXCEPTION01;

public class AscArray {
	public static void main(String[] args) 
	{
		int a[]={21,143,45,75,4,35,5,7,6};
		int temp;
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
		//System.out.println("array after sorting in ascending order");
		//for (int i=0;i<a.length ;i++ )
		{
        System.out.println(a[i]);
		}
		}
	}
}




