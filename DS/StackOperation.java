class Stack
{
int a[];
int top;
int cap;
public Stack(int size)
{   cap=size;
	top=-1;
    a=new int[size];
}

public boolean isEmpty()
{
   return top==-1;
} 
public boolean isFull()
{
	 
	 return top==cap-1;
}
public int push(int x)
{if(isFull())
	{
      System.out.println("Stack is Full");
      System.exit(0);
	}
	
		return a[++top]=x;
}
public int pop()
{if(isEmpty())
	{
		System.out.println("Stack is Empty");
		System.exit(0);
	}
	return a[top--];

}
public void display()
{
	for (int i=0;i<=top ;i++ ) {
	    	System.out.print(a[i]+" ");
	    } 

}
 

}

class StackOperation
{
	public static void main(String[] args) {
		Stack stk=new Stack(10);
		stk.push(100);
		stk.push(200);
	   stk.push(300);
	   stk.push(700);
		stk.push(400);
	   stk.push(800);
	   stk.push(546);
		stk.push(678);
	   stk.push(123);
	   stk.push(100);
	   stk.display();
	   System.out.println("\n--------");
	   stk.pop();
	   stk.pop();
	   stk.pop();
	   stk.pop();
	   stk.pop();
	   stk.pop();
	   stk.pop();
	   stk.pop();
	   stk.display();
}
	
}