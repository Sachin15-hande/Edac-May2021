package sachin.ASSign;

/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor*/
public class Rectangle {
	int l;
	int b;
	Rectangle(int l,int b)
	{
		
	}
	int area(int l,int b)
	{
		int area;
		return area=l*b;
	}

	public static void main(String[] args) {
		Rectangle re=new Rectangle(4,5);
		System.out.println("Area of Rectangle is "+re.area(4, 5)+" when length and breadth is 4 and 5");
		new Rectangle(5,8);
		System.out.println("Area of Rectangle is "+re.area(5, 8) + " when length and breadth is 5 and 8");
	}

}
