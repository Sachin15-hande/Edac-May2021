package ADS;
class Node1
{
	int data;
	Node1 prev;
	Node1 next;
	public Node1(int d)
	{
		data=d;
		prev=null;
		next=null;
	}
}
public class DoublyLinkedList {
	Node1 head;
	
	public void insertAtFirst(int data)
	{
		Node1 newnode=new Node1(data);
		newnode.next=head;
		newnode.prev=null;
		if(head!=null)
			head.prev=newnode;
		head=newnode;
	}
	    public void print()
	    {
		    Node1 temp = head;
		    while( temp != null ){
			System.out.println(temp.data);
			temp = temp.next;
		   }
		}
		


	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insertAtFirst(1234);
		list.insertAtFirst(4554);
		list.print();
	}

}
