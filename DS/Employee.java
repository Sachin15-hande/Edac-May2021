package Array;
import java.util.*;

import sachin.IO;

class Employee
{
	int id;String name;
	static List<Employee>ls=new ArrayList<>();
	public Employee()
	{
		
	}
	public Employee(int id,String name)
	{
		this.id=id;
	    this.name=name;
	}
	public void disEmp()
	{System.out.println("Employee Deatils are");
		for(Employee el:ls)
		{
          System.out.println(""+el.id);			
		}
	}


     public static void main(String[] args) {
		Employee ep=new Employee();
		ls.add(new Employee(123,"sachin"));
		ls.add(new Employee(125,"Sanket"));
		ls.add(new Employee(143,"Sairaj"));
		ls.add(new Employee(185,"Sameer"));
		ls.add(new Employee(115,"Sadeep"));
		ep.disEmp();
		//ep.findEmp("sachin");
	}
	public String findEmp(String name)
	{
		for(Employee el:ls) 
		{
		if(name.equals(el.name)) {
			System.out.println("Employee is present " + el.name);
			
	    }
		
	}
		return name;

}
}
