package Array;
import java.util.*;
class Array
{
	
	public int getmax(int a[])
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
	public int getmin(int a[])
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
	public float getavg(int a[])
	{
		float sum=0;
		float Avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		Avg=sum/a.length;
		return Avg;
	}
}
class ArrayMain
{
	public static void main(String[]args)
	{ int a[]=new int[] {13,6567,7278,6453};
	System.out.println("Given Array is");
	for(int x:a)
	{
		System.out.print(" " + x);
	}
	System.out.println("\n-----------------------");
		Array Ar=new Array();
		System.out.println("\nMaximum number is " + Ar.getmax(a));
		System.out.println("Minimun number is " + Ar.getmin(a));
		System.out.println("Average  is " + Ar.getavg(a));
		
		
	}
		
}








