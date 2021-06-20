package ADS;

public class LinearSearch {
   public static void search(int a[],int n,int key)
   { int i;
	   for(i=0;i<n;i++)
     {
	   if(key==a[i])
	   {
		   System.out.println("element " +key+ " is found at index "+i);
		   break;
	   }
     }
	  if(i==n)
	  {
		  System.out.println("Element is not found");
	  }
   }
	
	public static void main(String[] args) {
	int a[]={78,89,43,23,67,89,74,13,134};
	int n=a.length;
	search(a,n,100);

	}

}
