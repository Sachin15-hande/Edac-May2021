package Array;

import sachin.IO;

public class ArrayOperation {
	
	public static void display(int a[])
	{
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
	
	public static void insert(int a[],int pos,int n)
	{  for(int i=a.length-1;i>pos-1;i--)
	   {
		a[i]=a[i-1];
	   }
		a[pos-1]=n;
	}
	public static void delete(int a[],int n)
	{  for(int i=0;i<a.length;i++)
	   {    if(n==a[i])
	       {
		       for(int j=i;j<a.length-1;j++)
		      {
			   a[j]=a[j+1];
		      }
		       break;
	       }   
	   
	   }		 
   }
		
	

	public static void main(String[] args) {	
		int a[]= {12,43,56,57,65};
		System.out.println("----------Array Before any Operation is------------");
		display(a);
		//int pos=IO.getint("\n\nEnter a position where u want to insert a number in Array ");
		int n=IO.getint("\n\nEnter a number you want to insert in Array");
		//insert(a,pos,n);
		//System.out.println("\n\n---------------After Inserting a number Array is----------- ");
          //display(a);
          delete(a,n);
          display(a);
	}

}
