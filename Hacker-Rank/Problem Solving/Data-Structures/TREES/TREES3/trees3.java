//Tree: Height of a Binary Tree
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
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
	static ArrayList<Integer> al=new ArrayList<>();
	public static int height()
	{
		
	}
	public static void Traversal(Node root)
	{
		if()
		{

		}
	}
	public static void main(String args[])
	{
		InputStreamReader isr=new InputStreamReader();
		BufferedReader br=new BufferedReader(isr);
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.right.right=new Node(6);
		Node.Traversal(root);
	}
}
