class Node
{
       int data;
       Node left;
       Node right;
       Node(int data)
       {
		this.data=data;
       }
}
class A
{
	static int rdata;
	static boolean result=true;
	public static void traversal(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			if((root.left).data>(root.data) || (root.right).data<(root.data) 
			|| (root.left).data>rdata && (root.right).data<rdata)
			{
				result=false;
			}
			traversal(root.left);
			traversal(root.right);
		}
		
	}
	static boolean checkBST(Node root)
	{
		rdata=root.data;
		A.traversal(root);
		return result;
	} 
	public static void main(String args[])
	{
		Node root=new Node(10);

		root.left=new Node(5);
		root.right=new Node(20);
		
		root.left.left=new Node(1);
		root.left.right=new Node(6);
		root.right.left=new Node(15);
		root.right.right=new Node(25);
		
		A.checkBST(root);

		System.out.println(result);
	}
}
