package javaassign;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Sachin");
		list.add("Sanket");
		list.add("Sairaj");
		list.add("Sandeep");
		System.out.println("Before updating list");
		System.out.println(list);
		list.set(1, "Samrath");
		System.out.println("After updating list");
		System.out.println(list);
		

	}

}
