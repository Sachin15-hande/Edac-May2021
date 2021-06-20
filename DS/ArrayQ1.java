/*If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.
Output: 30,25,40,32,31,35*/

class ArrayQ1
{
	int a[]={10,12,20,30,25,40,32,31,35,50};

public void display()
{
	for(int i=3;i<a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
}
	public static void main(String...args)
	{
        ArrayQ1 arr=new ArrayQ1();
        arr.display();
	}
}