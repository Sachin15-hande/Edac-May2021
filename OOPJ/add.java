package sachin;
import java.util.Scanner;
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
       int c=a+b;
       System.out.println("sum is = "+c);
	}

}
