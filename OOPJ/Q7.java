package javaassign;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("123");
		list.add("Sachin");
		list.add("Sameer");
		list.add("Sandeep");
		list.add("Sam");
		boolean ans=list.contains("Sachin");
		if(ans)
		System.out.println("name u entered is present");
		else
			System.out.println("name u entered is not present");
	}

}
