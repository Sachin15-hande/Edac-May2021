package sachin.ASSign;
/*Write a program to print the roll number and average marks of 8 students in three subjects (each out
of 100). The marks are entered by user.*/
import sachin.IO;
import java.util.*;
class Student
{
   int roll_number;
   float sub_1,sub_2,sub_3;
   float avg_marks;
   static List<Student>li=new ArrayList<>();
	
	 public Student() {
	  
	        }
	 
   public Student(int roll_number,float sub_1,float sub_2,float sub_3 ,float avg_marks)
   { this.roll_number=roll_number;
     this.sub_1=sub_1;
     this.sub_2=sub_2;
     this.sub_3=sub_3;
     this.avg_marks=avg_marks;
   }
   
   public void setDetails() {
		int n=IO.getint("How many Student You want to add");
		 
		for(int i=0;i<n;i++)
		{
			int roll_number=IO.getint("Enter Student Roll Number");
		    float sub_1=IO.getfloat("Enter first Subject  Marks");
		    float sub_2=IO.getfloat("Enter second Subject Marks");
		    float sub_3=IO.getfloat("Enter third Subject  Marks");
		    float avg_marks=(float)(sub_1+sub_2+sub_3)/3;
		    li.add(new Student(roll_number,sub_1, sub_2,sub_3, avg_marks));
			
		}
	}

   public void show()
   { System.out.println("\t\t\t----//----Students Details----//----\n\n");
	   for(Student se:li)
	   {
	   System.out.println("\tStudent Roll Number is:- \t" + se.roll_number);
	   System.out.println("\tFirst Subject Mark is:- \t" + se.sub_1);
	   System.out.println("\tSecond Subject Mark is:- \t" + se.sub_2);
	   System.out.println("\tThird Subject Mark is:- \t" + se.sub_1);
	   System.out.println("\tAverage Marks of 3 Subject is:-\t " +se.avg_marks);
	   System.out.println("=========================================");
	   }
	   
   }

	public static void main(String[] args) {
		Student st=new Student();
		st.setDetails();
		st.show();
		

	}

	
}

