package sachin.ASSign;
import java.util.*;
public class Myconsole
{
private static Scanner sn = new Scanner(System.in);		    
		    public static String getString(String question) 
		    {
		    	System.out.println(question);
		    	return sn.nextLine();
		    }
		    public static int getNumber(String question) 
		    {
		    	System.out.println(question);
		    	return sn.nextInt();
		    }
		    public static float getnumber(String question)
		    {
		    	System.out.println(question);
		    	return sn.nextFloat();
		    }
}


