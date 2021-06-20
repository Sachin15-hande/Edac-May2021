package javaassign;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		List<String>city=new ArrayList<>();
		city.add("Aurangabad");
		city.add("Pune");
		city.add("Nanded");
		city.add("Mumbai");
		city.add("Satara");
		System.out.println("List of city before deleting is \n"+city);
		city.remove(3);
		System.out.println("List of city After deleting a city at index 3 is \n"+city);
		
	}

}
