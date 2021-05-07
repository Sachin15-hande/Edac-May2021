import java.util.Scanner;
class P12
{
    public static void main(String[] args)
   {
     System.out.println("Enter three numbers");
	 Scanner sc=new Scanner(System.in);
	 float a=sc.nextInt();
	 float b=sc.nextInt();
	 float c=sc.nextInt();
	 float avg=((a+b+c)/3);
	 System.out.println("Average of three numbers is= " + " "+avg);
   }

}