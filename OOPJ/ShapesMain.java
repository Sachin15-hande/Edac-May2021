package sachin.ASSign;
/*Create a class named Shape with a function that prints "This is a
shape". Create another class named Polygon inheriting the Shape
class with the same function that prints "Polygon is a shape".
Create two other classes named Rectangle and Triangle having
the same function which prints "Rectangle is a polygon" and
"Triangle is a polygon" respectively. Again, make another class
named Square having the same function which prints "Square is a
rectangle".*/
 class Shape
{
	 void show() {
		 System.out.println("This is a Shpae");
	 }
	
}
class Polygon extends Shape
{
	void show()
	{
		System.out.println("Polygon is a shape");
	}
}
class Rect extends Polygon
{
	void show()
	{
		System.out.println("Rectangle is a polygon");
	}
}
class Triangle extends Polygon
{
	void show()
	{
		System.out.println("Triangle is polygon");
	}
}
class Square extends Polygon
{
	void show()
	{
		System.out.println("Square is polygon");
	}
}
public class ShapesMain {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.show();
		s=new Polygon();
		s.show();
		s=new Rect();
	    s.show();
	    s=new Triangle();
	    s.show();
	    s=new Square();
	    s.show();
		
	}
}
