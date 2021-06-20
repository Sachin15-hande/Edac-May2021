package ADS;
import java.util.*;
public class RecursionFibo {
	
	int show(int n)
	{
		
	if(n==0||n==1)
	{
		return 1 ;
	}
	    return show(n-1)+show(n-2);
	
	}

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		RecursionFibo re=new RecursionFibo();
		//System.out.println("Enter a number to find its Series");
		//int n=sc.nextInt();
		for(int i=0;i<=3;i++)
		{
		System.out.println(" "+re.show(i));
		}
	}

}
