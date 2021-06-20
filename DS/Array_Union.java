package Array;

public class Array_Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,7};
		int b[]= {2,3,5,6};
		int c[]=new int [10];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]<=b[j])
				{
					c[i]=a[i];
					
					
				}
			}
		}
		for(int k=0;k<c.length;k++)
		{
		System.out.print(" "+c[k]);
		}
  }
}