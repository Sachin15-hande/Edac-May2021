package Array;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]=new int[]{1,2,3,3,4,6,6};
       System.out.println("Duplicate numbers are");
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]==a[j])
    		   {
    			   System.out.print(" "+a[i]);
    			   
    		   }
    		  
    	   }
       }
	}

}
