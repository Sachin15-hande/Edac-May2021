package javaassign;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Sachin");
		list.add("Sanket");
		list.add("Sairaj");
		list.add(3, "Sandhya");
		System.out.println(list);
		System.out.println("Name at specific index");
		System.out.println(list.get(0));

	}

}
