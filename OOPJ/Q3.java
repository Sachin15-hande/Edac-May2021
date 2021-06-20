package sachin;
import java.util.*;


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter values of x and y");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		 y=x*x+3*x-7;
		System.out.println("value of y is ="+" "+y);
		y=x++ + ++x;
		System.out.println("value of x is ="+" "+x);
		System.out.println("value of y is ="+" "+y);
		int z=((x++) - (--y) - (--x) + (x++));
		System.out.println("vlaue of x is ="+" "+x);
		System.out.println("vlaue of y is ="+" "+y);
		System.out.println("vlaue of z is ="+" "+z);
		System.out.println("Enter boolean value");
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c;
		c=(a&&b)||!(a||b);
		System.out.println("vlaue of c is"+" "+c);


	}

}
