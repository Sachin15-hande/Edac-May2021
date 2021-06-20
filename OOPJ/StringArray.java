package javaassign;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class StringArray {

	
	public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		          List<String>nlist=new ArrayList<>();
		
		          System.out.println("Please enter names of Students");
		                String name;
		                   for(int i=1;i<=5;i++)   //this for loop is used to take input from user of type String
		                       {
			                      name=sc.nextLine();
			                       nlist.add(name);
		                        }
			System.out.println("The Number of Students Entered is " +nlist.size());
			System.out.println("List of Students is ");
				for(String s:nlist)
		        {
			       System.out.println(s);
	         	}
    }

}
