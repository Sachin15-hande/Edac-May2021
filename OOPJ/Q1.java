package javaassign;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		List<String>colour=new ArrayList<>();
		colour.add("Pink");
		colour.add("Yellow");
		colour.add("Black");
		colour.add("Red");
		//System.out.println(colour);
		System.out.println("List of colours is ");
		Iterator<String> itr=colour.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
