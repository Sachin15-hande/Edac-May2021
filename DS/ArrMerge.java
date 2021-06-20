class ArrMerge
{
public static void merge(int array[],int array1[],int size)
{
	int c[]=new int[size];
	for (int i=0;i<array.length;i++ ) {
		c[i]=array[i];
		
	}
	for (int i=0;i<array1.length;i++) {
		c[i+array.length]=array1[i];
	}
    for(int i=0;i<size;i++)
    {
    	System.out.print(c[i]+" ");
    }
}

	public static void main(String[] args) {
		int array[]={12,33,43,24};
		int array1[]={23,54,23,12};
		int size=array.length+array1.length;
		merge(array,array1,size);
	}
	
}