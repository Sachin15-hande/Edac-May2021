/*3. Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
?.3 4 5 1 2
2 3 4 5 1
1 2 3 4 5*/

class ArrayQ3
{ 
	
	public static void main(String...args)
	{
            int a[]={1,2,3,4,5};
            int temp=0;
            int last_index=a.length-1;

         temp=a[last_index];
         for(int i=0;i<a.length;i++)
        {
            for(i=a.length-2;i>0;i--)
             {
	              a[i+1]=a[i];//1 2 3 4
	              
	         }
	         a[0]=temp;
	         System.out.println(a[i]);	         
        }         
}
      
}
