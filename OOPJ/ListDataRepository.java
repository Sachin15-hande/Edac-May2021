package sachin;

import java.util.*;

class Employee {
	int empid;
	String name;
	String address;
	int empsalery;

	public Employee(int empid, String name, String address, int empsalery)// Constructor for initializations
	{
		
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.empsalery = empsalery;

	}
}
     interface DataRepository {
		   void AddEmployee(Employee emp);//Unimplemented method
		   void DeleteEmployee(int id);
		   Employee [] Finde(String name);
		   void UpdateEmployee(Employee emp);
	  }


class ListDataRepository implements DataRepository // class which implements DataRepository
{

	ArrayList<Employee> el = new ArrayList<Employee>();

	@Override
	public void AddEmployee(Employee emp) {
		el.add(emp);
		
	}

	@Override
	public void DeleteEmployee(int id) {
		for(int i=0;i<el.size();i++)
		{
			if(id==el.get(i).empid)
			{
				el.remove(i);
				break;
			}
		}
	}

	@Override
	public Employee[] Finde(String name) {
		for(int i=0;i<el.size();i++)
		{
			if(name.equals(el.get(i).name))
			{
				el.get(i);

				break;
			}
		}
		return null;
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		el.set( 2, new Employee( 165,"Sameer","Sangli",23448) );
		

	}
	
	

	public void disEmployee()
	{
		System.out.println("-------Employee Details--------");
		for(Employee em:el) {
		   System.out.println("Employee ID :" +em.empid); 
		   System.out.println("Employee Name : " +em.name); 
		   System.out.println("Employee Address is : " +em.address); 
		   System.out.println("Employee Salery is : " +em.empsalery); 
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp = new Employee(123, "Sachin", "Aurangabad", 12344);
		Employee emp1 = new Employee(456, "Sandhay", "Mumbai", 44366);
		Employee emp2 = new Employee(356, "Sandeep", "Satara", 67366);
		Employee emp3 = new Employee(556, "Sanket", "Pune",54366);
		ListDataRepository dr = new ListDataRepository();
		dr.AddEmployee(emp);
		//dr.AddEmployee(emp1);
		//dr.AddEmployee(emp2);
		//dr.AddEmployee(emp3);
		//System.out.println("After Adding Employee list is");
		//dr.UpdateEmployee(emp2);
		//System.out.println("After Updating Employee list is");
		dr.disEmployee();
		//System.out.println("Enter id for Deleting Employee");
		//int a=sc.nextInt();
		//dr.DeleteEmployee(a);
		//System.out.println("After deleting Employee list is");
		//dr.disEmployee();
	
		dr.Finde("Sandeep");
		
		
	}
}
