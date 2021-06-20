/*Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
INITIAL array :
1 2 3 4 5 6 7 8 9 10*/

class ArrayQ2
{
	int arr[]={1,2,3,4,5,6,7,8,9,10};
    int a[]=new int[5];
    int b[]=new int[5];
    int x=0,y=0;
    public void insert()
    {
    	for(int i=0;i<arr.length;i++)
    	{ 
    		if(i<=(arr.length/2-1))
    		{
    			a[x]=arr[i];
    			x++;
    				
    		}
            else
            {
            	b[y]=arr[i];
            	y++;
            }

    	}
    }
     public void dis()
    {
    for (int x :a ) 
    {
    	System.out.print(x+" ");
    	
    }
    System.out.println(" ");
            for (int y :b ) 
            {
    	       System.out.print(y+" ");
            }
}
public static void main(String...args)
{   ArrayQ2 aq=new ArrayQ2();
	aq.insert();
	aq.dis();

}	
}