package sachin.ASSign;

public class NumRec {

	static void series(int n)
	{  int sum=0;
	   for(int i=0;i<n;i++)
	{ 
		 if(i%2==0)
		 {
			 sum=sum+i;
		 }
	}
	   System.out.println("Sum of Even Number is "+sum);
	
	}
	public static void main(String[] args) {
		series(10);
	}

}
