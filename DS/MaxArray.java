package Array;

public class MaxArray {

	public static int max(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
			max=a[i];	
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[]{12,43,56};
		int largest=max(a);
		
		System.out.println("maximum number in an Array is " + largest);
    	}

}
