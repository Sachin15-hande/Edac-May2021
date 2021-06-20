package ADS;
class Node
{ 
	int data;
    Node next;
  Node()
 {
	 
 }
 public Node(int data)
 {
	 this.data=data;
     this.next=null;
	 
 }
	
}
public class LinkedList {
     Node head;
     public void inserAtFirst(int data)
     {
    	 Node node=new Node(data);
    	 if(head==null)
    	   head=node;
    	 else
    	 {
    		 node.next=head;
    		 head=node;
    	 }
     }
     public void insertAtEnd(int data)
     {
    	 Node my_node=new Node(data);
    	 if(head==null)
    		 head=my_node;
    	 else
    	 {
    		 Node temp=head;
    		 while(temp.next!=null)
    		 {
    			 temp=temp.next;
    		 }
    		 temp.next=my_node;
    	 }
     }
     
     public void insertAtMiddle(int data)
     {
    	 Node my_node=new Node(data);
    	 Node temp=head;
    	 if(temp!=null)
    	 {
    		 my_node.next=temp.next;
    		 temp.next=my_node;
    	 }
     }
     public void view()
     {
      Node temp=head;
     if(head==null)
    	 head=temp;
     else
     {
    	 while(temp!=null)
    	 {
    		 System.out.print(temp.data+ " ====> ");
    		 temp=temp.next;
    	 }
     }
    	 
    	 
     }
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(1200);
		list.head.next=second;
		second.next=third;
		list.view();
		System.out.println("\n\n-------Node Inserted At First------------\n\n");
		list.inserAtFirst(294);
		list.view();
		System.out.println("\n\n-------Node Inserted At Last------------\n\n");
		list.insertAtEnd(98098);
		list.view();
		System.out.println("\n\n-------Node Inserted At Middle------------\n\n");
		list.insertAtMiddle(89089);
		list.view();
		
	}

}
