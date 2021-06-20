package sachin.ASSign;

/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.
*/
public class Tri{
	float side1=3;
	float side2=4;
	float side3=5;
	public float peri()
	{
	    float perimeter;
	    perimeter=side1+side2+side3;
		return perimeter;	
	}
	public double area()
	{
	   float s=0;
       s=(side1+side2+side3)/2;
       float a =s*((s-side1)*(s-side2)*(s-side3));
      float ar=(float)Math.sqrt(a);
		return ar;
	}

	public static void main(String[] args) {
		Tri tr=new Tri();
		System.out.println("Perimeter Of Triangle is " +tr.peri());
		System.out.println("Area Of Triangle is " + tr.area());

	}

}
