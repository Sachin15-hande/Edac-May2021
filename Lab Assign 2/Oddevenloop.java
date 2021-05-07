import java.util.Scanner;
class Oddevenloop
{
  public static void main(String[] args)
  {
   System.out.println("To find out how many even numbers!" + " Enter a number");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int t=0;
    for(int i=1;i<=n;i++);
	{
		 int a=i+1;
		 t=a;
     System.out.println(a);
   
	}
  }
}