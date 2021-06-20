package sachin.ASSign;
import sachin.IO;
import java.lang.Throwable;
/*Write a program to calculate the average height of all the students of a class. The number of students
and their heights in a class are entered by user.*/


public class Height_cal {
	void setheight()
	{  
		int n=IO.getint("Enter no of Studnets");
		float []height=new float[n];
		float avg=0;
		try {
			for(int i=0;i<n;i++)
			{
				float sum=0;
				float a=IO.getfloat("Enter heights of Student " + i + " in feet");
				height[i]=a;
				sum=sum+height[i];
				avg=sum/n;
			}
			System.out.println("Average Height of All Students is "+avg + " feet ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check array length");
			
		}	
		
	}
	public static void main(String[] args) {
		Height_cal h=new Height_cal();
		h.setheight();
		
	}

}
