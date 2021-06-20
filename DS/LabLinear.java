package ADS;
import java.util.*;
public class LabLinear {
	static public void search(int a[],int l,int key)
	{int i;
		for(i=0;i<l;i++)
	{
		if(a[i]==key)
		{
			System.out.println("Number "+key+ "is Found at index "+i);
			break;
		}
	}
		if(i==l)
		{
			System.out.println("Element is not found");
		}
	}
	static void dis(int a[])
	{System.out.println("\nArray is");
		for(int x:a)
	{
		System.out.print(x+" ");
	}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Array Length");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int l=arr.length;
		System.out.println("\nEnter Array Elements");
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		dis(arr);
		System.out.println("\nEnter number you want to search");
		int key=sc.nextInt();
        search(arr,l,key);
	}

}
