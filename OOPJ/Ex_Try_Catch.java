package sachin;
import java.util.*;
public class Ex_Try_Catch {

	public static void main(String[] args) {
		SimpleException();

	}
     private static void SimpleException()
     { 
	    	 Scanner sc=new Scanner(System.in);
		     System.out.println("Enter a number");
		     try {
		           int n=sc.nextInt();
		           System.out.println("Entered value is " + n);
		          }catch(InputMismatchException n) {
			          System.err.println("Enter integer value in range " + Integer.MIN_VALUE + " and " + Integer.MAX_VALUE);
		           }
     }
}
