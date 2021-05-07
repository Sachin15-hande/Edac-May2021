import java.util.Scanner;
public class PrimeNumber
{
  public static void main(String[] args)
   {
	   System.out.println("Enter a number");//taking input from user
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int flag=0;
   if(n==0||n==1)
      System.out.println(n+(" is not a prime Number"));
	  else
	  {
		  for(int i=2;i<=n/2;i++)
		  {
			  if(n%i==0)
			  {
	       System.out.println(n+(" is not a prime"));
		   flag=1;
		   break;
			  }
		  }
	            if(flag==0)
	          {
		  System.out.println(n+(" is prime number"));
	          }
	  }
   }
}