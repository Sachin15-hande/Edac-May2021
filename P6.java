import java.util.Scanner;
class P6
{
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b,d=a-b,e=a+b,f=a/b,g=a%b;
		System.out.println("The Results are below");
			System.out.println(e);
			System.out.println(d);
			System.out.println(c);
			System.out.println(f);
			System.out.println(g);
	}
}