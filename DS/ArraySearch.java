class ArraySearch
{ 
public static void search(int a[],int x)
{
   for (int i=0;i<a.length ;i++ ) {
   	if(a[i]==x)
   	{
   		System.out.println("Element "+ x +" is present at index "+ i );
   		break;
      }
      
   }

}
	public static void main(String[] args) {
		int a[]={10,20,80,30,60,50,110,100,130,170};
		search(a,110);
	}
	
}