package sachin;
import java.util.*;
public class Ass1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter Principal Amount");
       Scanner sc=new Scanner(System.in);
       float p=sc.nextFloat();
       System.out.println("Enter Rate of Interest %");
       float r=sc.nextFloat();
       System.out.println("Enter time in years");
       byte t=sc.nextByte();
       float SI=p*r*t/100.0f;
       System.out.println("The Simple Interest on Principal "+p+" is "+"" +SI);
	}

}
