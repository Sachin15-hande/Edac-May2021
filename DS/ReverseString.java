package ADS;
//import java.util.Stack;
import java.util.*;

class ReverseString 
{ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
	    String inputString=sc.nextLine();
	    int n=inputString.length();
	    Stack stack= new Stack(n);
	    		
	    for(int i=0;i<n;i++)
	    {
	    	stack.push(inputString.charAt(i));
	    }
	    
			System.out.println("\n------Reverse String is----------");
			String ch=" ";
			while(stack.isEmpty()==false)
			{ 
				 ch=ch+(char)stack.pop();
			}
			System.out.print(ch+" ");
	}

}