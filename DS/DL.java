class DL
{
	Node head;
	class Node
	{ int data;
	  Node next;
	  Node prev;
	  public Node()
	  {

	  }
	  public Node(int data)
	  {
	  	this.data=data;
	  } 
	}	
public void view()
{
	Node temp=head; 
    while(temp!=null)
  {
  	System.out.print(temp.data+ " =====> ");
  	temp=temp.next;
  }
}
public void insertAtLast(int data)
{  
	Node temp=head;
	


}
	public void insert(int data)
	{ 
		Node new_node=new Node(data);
		new_node.next=head;
		new_node.prev=null;
		if(head!=null)
			head.prev=new_node;
		head=new_node;
	}
    public void InsertAfter( int data)
			{
			 Node newnode = new Node(data);
			 Node temp=head;
			 if (newnode.next != null)
			        newnode.next.prev = newnode;
			    
			    newnode.next = temp.next;
			    temp.next = newnode;
			    newnode.prev = temp;
			 
	}

	public static void main(String[] args) {
		DL dl=new DL();
		dl.insert(17789);
		dl.insert(7879);
		dl.insert(779);
		dl.insert(78);
		//dl.InsertAfter(78);
	g	dl.view();
	}
}