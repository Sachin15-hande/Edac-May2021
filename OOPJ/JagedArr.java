package sachin;
import java.util.*;
public class JagedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r=sc.nextInt();
		System.out.println("Enter number of columns");
		int c=sc.nextInt();
       int[][]ja=new int[r][c];
       //ja[0]=new int[2];
       //ja[1]=new int[5];
     System.out.println("enter values in array");
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<c;j++)
    	   {
    		  ja[i][j]=sc.nextInt();
    	   }
    	   System.out.println("Jagged Array is");
       }
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<c;j++)
    	   {
    		  System.out.print(" "+ja[i][j]);
    	   }
    	   System.out.println();
       } 
       sc.close();
	}

}
