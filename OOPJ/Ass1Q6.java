package sachin;
import java.util.Scanner;
public class Ass1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a radius of circle");
 Scanner sc=new Scanner(System.in);
 float radius=sc.nextFloat();
 double pi=3.14;
 double Area,Perimeter;
 Area=pi*Math.pow(radius,2);
 Perimeter=2*pi*radius;
 System.out.println("Area of Circle is ="+""+Area);
 System.out.println("Perimeter of Circle is ="+""+Perimeter);
 
	}

}
