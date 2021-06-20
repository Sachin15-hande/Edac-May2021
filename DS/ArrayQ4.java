/*4. Write a program to find all pairs on an integer array whose sum
is equal to a given number?
Eg :
Input : 1 2 4 5 3 6 3 7
Output: 3, 3 and 4, 2
6,1 and 4 , 3 */

class ArrayQ4
{
    public static void main(String[] args) {
    	int a[]={1,2,4,5,3,6,3,7};
    	int n=6;
    	for (int i=0;i<a.length;i++  ) {
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]+a[j]==n)
    				System.out.println(a[i]+" "+a[j]);
    		}
    		
    	}
   	
   }

}
	
