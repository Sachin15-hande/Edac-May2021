package Array;
import sachin.IO;
import java.util.*;

class Array_Student_Class {
	      int id;
	      String name;
	  static Array_Student_Class st[]=new Array_Student_Class[10];
	     
	      public Array_Student_Class(int id,String name)
      {
    	  this.id=id;
          this.name=name;
      }

static public void setDetails()
{
	int n=IO.getint("how many students u want to enter");

	
     for(int i=0;i<n;i++)
	{        
		      
				  int id=IO.getint("Enter Student id"); 
				  String name=IO.getstring("Enter Student name"); 
				  st[i]=new Array_Student_Class(id,name);
	}
}
	static public void displayDetails()
	{
		try {
			System.out.println("--------Students Details----------");
			for(Array_Student_Class se:st)
			{
				System.out.println("Student id is :- " + se.id + "\nStudent name is :- " + se.name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
         public static void main(String[] args) {
		setDetails();
		displayDetails();
		
	}
}
