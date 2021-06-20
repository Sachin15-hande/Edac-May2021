package sachin;
import java.util.*;
class Empl
{
	int id;
	String na;
	String Add;
	int sal;
	Empl(int id,String n,String Add,int sal)
	{
		this.id=id;
		this.na=n;
		this.Add=Add;
		this.sal=sal;
	}
}
public class Alist {

	public static void main(String[] args) {
		Empl emp=new Empl(123,"Sachin", "Aurangabad", 76849);
		Empl emp1 =new Empl(324,"sandhya", "Nanded", 5784); 
		ArrayList <Empl> emlist=new ArrayList<Empl>();
		emlist.add(emp);
		emlist.add(emp1);
		
		 Iterator<Empl> itr=emlist.iterator();  
		  //traversing elements of ArrayList object  
		 
		 while(itr.hasNext()){  
		    Empl emplist=(Empl)itr.next();  
		    System.out.println(emplist.id+" "+emplist.na+" "+emplist.Add+" "+emplist.sal);  
		  }  
	}
}
