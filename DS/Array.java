class Array
{
	private int a[];
	private int array_size;
	public Array(int size)
	{
		array_size=size;
		int a[]=new int[size];
	}
	 public void show()
	{ 
		for (int x : a) {
		System.out.print(x+" ");
	     }

	}
	

}
public class ArrayOperation
{
	public static void main(String...args)
	{Array ar=new Array(5);
		ar.show();

	}

}