package javaassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(123);
		list.add(342);
		list.add(1245);
		list.add(23);
		list.add(256);
		System.out.println("List before Sort" +list);
		Collections.sort(list);
		System.out.println("After sort " +list);
		
		
	}

}
