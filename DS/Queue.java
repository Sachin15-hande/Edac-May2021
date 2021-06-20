class Queue
{ 
	int front;
	int rear;
	int size;
	int a[];

public Queue(int s)
{
	size=s;
	front=0;
	rear=-1;
	a=new int[size];

}
	boolean isFull()
	{
		return rear==size;
	}

      boolean isEmpty()
     {
	   return front==rear;
     }

public  void enqueue(int data)
{
	if(isFull())
	{
		System.out.println("Queue is Full");
		System.exit(0);
	}
	else
	{
		rear++;
		a[rear]=data;		 
	}
}
public void dqueue()
{ if(isEmpty())
	{
		System.out.println("Queue is Empty");
		System.exit(0);
	}
	front++;
}

public  void display()
{
	
	for(int i=front;i<rear;i++)
	{
		System.out.print(a[i]+" ");
	}
} 

public static void main(String[] args) {
		Queue q=new Queue(10);
		q.enqueue(100);
		q.enqueue(120);
		q.enqueue(300);
		q.enqueue(500);
		q.enqueue(900);
		System.out.println("\n-------After Adding Element Queue is----------");
		q.display();
		q.dqueue();
		q.dqueue();
		System.out.println("\n-------After Deleteing Element Queue is----------");
		q.display();

	}	
}