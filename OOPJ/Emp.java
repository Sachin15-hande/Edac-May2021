package sachin.ASSign;

/*Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat*/

  class Emp {
	 String name;
	 int year;
	 String salery;
	 String address;
	 public Emp()
	 {
		 
	 }
public Emp(String name,int year,String salery,String address)

{ System.out.println(name+"  "+"  "+year+"  " +salery+"  "+address);

}

	public static void main(String[] args) {
		new Emp("Robert",1994,"64C","WallsStreat");
		new Emp("Sam",2000,"68D","WallsStreat");
		new Emp("John",1999,"26B","WallsStreat");
		
	}

}
