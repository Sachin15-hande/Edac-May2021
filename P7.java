import java.util.Scanner;
class P7
{
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		int c=1;
	do
	{
		c++;
	 a=8*c;
	 System.out.println(a);
	}
	while(c<10);

	}
}