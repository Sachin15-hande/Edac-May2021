package ADS;

 class BNode {
	int data;
	BNode left,right;
	
	public BNode(int d)
	{
		data=d;
		left=null;
		right=null;
	}
}
class BinaryTree
{
	    BNode root;
		BinaryTree()
	{
		root=null;
	}
	void insert(int key)
	{
		root = insertData(root,key);
	}
	
	BNode insertData(BNode root, int key)
	{
		if(root == null)
		{
			root = new BNode(key);
			return root;
		}
		if(key < root.data)
			root.left = insertData(root.left, key);
		else if(key > root.data)
			root.right = insertData(root.right,key);
			return root;
	}
	
	void Inorder()
	{
		Inorder(root);
	}
	
	void Inorder(BNode root)
	{
		if(root != null)
		{
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}
	public static void main(String[]args)
	{
		BinaryTree bt=new BinaryTree();
		bt.insert(50);
		bt.insert(30);
		bt.insert(20);
		bt.insert(40);
		bt.insert(70);
		bt.insert(60);
		bt.insert(80);
		bt.Inorder();
		
		
	}
	
	
	
	
	
}