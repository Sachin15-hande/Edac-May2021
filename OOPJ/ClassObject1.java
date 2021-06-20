package sachin.ASSign;

/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/
public class ClassObject1 {
	String name;
	int rollNumebr;

	public static void main(String[] args) {
		ClassObject1 ob=new ClassObject1();
		ob.name="John";
		ob.rollNumebr=2;
System.out.println("Name :- " +ob.name + " \nRoll Number :- " + ob.rollNumebr);
	}

}

