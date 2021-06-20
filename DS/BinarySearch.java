package ADS;

public class BinarySearch {
	public static void binarySearch(int a[],int key)
	{   int l=0;
	    int h=a.length-1;
		int mid=(l+h)/2;
		while(h>=l)
		{
		if(key==a[mid])
		{
			System.out.println("element found at index "+mid);
			break;
		}
		else if(key>a[mid])
		{
			l=mid+1;
		}
		else
		{
			h=mid-1;//index 3
		}
		mid=(l+h)/2;
	}
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		binarySearch(a,6);
        
	}

}
