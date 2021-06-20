class Linked_List
{
Node head;

static class Node
{

   int data;
   Node next;
   Node(int d)
   {
   	data=d;
   	next=null;
   } 	
}

public void inserB(int data)
{ Node node=new Node(data);
	if(head==null)
		head=node;
	else
	{
		node.next=head;
		head=node;
	}

}
public void insertEnd(int data)
{
	Node node=new Node(data);
	if(head==null)
		head=node;
	    else
	    {
	    	Node temp=head;
	    	while(temp.next!=null)
	    	{
	    		temp.next=temp;
	    	}
	    	temp.next=node;
	    }
}

public void show()
{ 
	Node n=head;
	while(n!=null)
	{
		System.out.print(n.data + " ===>>> ");
		n=n.next;
	}

}
public static void main(String[] args) {
	Linked_List ls=new Linked_List();
	ls.head=new Node(100);
	Node second =new Node(120);
	Node third=new Node(130);
	ls.head.next=second;
	second.next=third;
	System.out.println("\n\n------------Linked List is -----\n\n");
    ls.show();
    ls.inserB(908);
    System.out.println("\n\n---------------After inserting Node at Begining Linked List is -----\n\n");
    ls.show();
    System.out.println("\n\n---------------After inserting Node at End Linked List is -----\n\n");
    ls.insertEnd(657);
    ls.show();
}



}


