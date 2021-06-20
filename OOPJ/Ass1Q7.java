package sachin;
import java.util.*;
public class Ass1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 subjects Marks out of 100");
		Scanner sc=new Scanner(System.in);
		float sum=0;
		float marks[]=new float[5];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextFloat();
		}
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("Sum of 5 subjects marks ="+""+sum);
		float per=(sum/500)*100;
		System.out.println("Percentage of 5 subjects ="+per+" "+"%");
	}

}
