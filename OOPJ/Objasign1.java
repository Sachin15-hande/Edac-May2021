package sachin.ASSign;
/*Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.*/

class Employee
{
	String name;
	int sal;
	String date;
	public Employee(String name,int sal,String date)
	{
		this.name=name;
		this.sal=sal;
		this.date=date;
	}
	
}
public class Objasign1 {
	public static void main(String[] args) {
		Employee []li=new Employee[10];	
		  li[0]=new Employee("sachin",124437,"12-3-2018"); 
		  li[1]=new Employee("sandeep",124432,"12-3-2018"); 
		  li[2]=new Employee("sameer",124438,"12-3-2018"); 
		  li[3]=new Employee("shravya",146543,"12-3-2018"); 
		  li[4]=new Employee("sahil",12456,"12-3-2018"); 
		  li[5]=new Employee("sanket",16786,"12-3-2018"); 
		  li[6]=new Employee("sandhya",12673,"12-3-2018"); 
		  li[7]=new Employee("samihan",12443,"12-3-2018"); 
		  li[8]=new Employee("Akshay",4439,"12-3-2018"); 
		  li[9]=new Employee("rohit",12436,"12-3-2018");
		 
		System.out.println("\t\t\t\t----///-----Employee Details are----//----------\n");
		for(Employee el:li)
		{
			System.out.println("\t Employee Name :- "+" " +el.name +"\t \tEmployee Salery :- "+" " +el.sal +"\t \tEmployee Joining Date :- "+" " +el.date);
			System.out.println("\n");
			
		}
		
	}

}
