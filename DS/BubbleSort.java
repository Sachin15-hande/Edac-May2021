import java.util.*;
class BubbleSort
{
	public void sort(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
		System.out.print(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		int a[]={13,89,67,90,10,3,2};
		BubbleSort bs=new BubbleSort();
		bs.sort(a);
	}
}