package Array;

public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]= {{1,4,2,3,3},{4,7,3,2,3},{4,4,3,2,4}}; 
       System.out.println("#######=============#######");
       System.out.println("Your 2d array is");
       try {
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a[0].length;j++)
    	   {
        	System.out.print(" "+a[i][j]);
    	   }
    	   System.out.println();   
        }
       
       }catch(Exception ex)
          {
     	    System.err.println(ex.getMessage());
          }
        
        System.out.println("Array length is="+a.length);
      
	}

}
