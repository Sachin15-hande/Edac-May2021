package sachin.ASSign;

import sachin.IO;

/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are
entered through keyboard.*/
public class Area {
	float length;
	float breadth;
    void setDim(float length ,float breadth)
   {this.length=length;
   this.breadth=breadth;
	 
   }
    float getArea(float length,float breadth )
    {
    	float Area;
    	Area=(length*breadth);
    	return Area;
    }
	
	public static void main(String[] args) {
		Area ar=new Area();
	float length=IO.getfloat("Enter Length of Rectangle in meter ");
	ar.length=length;
	float breadth=IO.getfloat("Enter Breadth of Rectangle in meter ");
	ar.breadth=breadth;
	ar.setDim(length, breadth);
	
	System.out.println("Area of Rectangle is "+ar.getArea(length, breadth) + " Sqm");
	}

}
