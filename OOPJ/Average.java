package sachin.ASSign;

import sachin.IO;

public class Average {
int number1;
int number2;
int number3;
float Avg(int n1,int n2,int n3)
{ 
	float Average=(n1+n2+n3)/3;
	
	return Average;
}
	public static void main(String[] args) {
	Average ag=new Average();
	int n1=IO.getint("Enter number first\t");
	ag.number1=n1;
	int n2=IO.getint("Enter number Second\t");
	ag.number2=n2;
	int n3=IO.getint("Enter number Three\t");
	ag.number3=n3;
	System.out.println("Average of 3 numbers is "+ag.Avg(n1, n2, n3));

	}

}
