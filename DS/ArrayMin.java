package Array;

public class ArrayMin {
	public static int min(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
			min=a[i];	
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[]{12,43,56};
		int smallest=min(a);
		
		System.out.println("Minimum number in an Array is " + smallest);
    	}

	
	}


