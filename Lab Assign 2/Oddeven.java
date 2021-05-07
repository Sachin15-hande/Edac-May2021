import java.util.Scanner;
class Oddeven
{
  public static void main(String[] args)
  {
   System.out.println("To find out how many even numbers!" + " Enter a number");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    for(int i=2;i<=n;i+2);
	{
   if(n%i==0)
     System.out.printn("Even number in between" +n "is" +i);
	}
	 
  }
}