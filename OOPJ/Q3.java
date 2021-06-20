package javaassign;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		List<String>name=new ArrayList<>();
		name.add("Sachin");
		name.add("Sandhya");
		name.add("Shrayva");
		System.out.println("Size of ArrayList Before adding is\n" +name.size());
        System.out.println("ArrayList before adding is " );
        System.out.println("\n"+name);
   
        name.add(0, "Kailash");
     
     System.out.println("After adding name at first position Size of ArrayList is \n"+name.size());
     System.out.println("After adding name at first position Names are\n");
     System.out.println(name);
	}

}
