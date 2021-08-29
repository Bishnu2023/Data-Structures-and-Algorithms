//PAYTM-Q3
import java.util.Scanner;
class Node
{
	public int data;
	public Node next;
	static Node head;
	static Node current=null; 
	static void insertData(int data)
	{
		Node n=new Node();
		n.next=null;
		n.data=data;
		if(head==null)
		{
			head=n;
			current=head;	
		}
		else
		{
			current.next=n;
			current=current.next;	
		}
	}
	static void printNodes()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	static void MoveNodes(Node head, int k, int n)
	{
		Node temp=head;
		int t=0;
		while(temp!=null)
		{
			t++;
			temp=temp.next;
		}
	        temp=head;
		Node temp1=head;
		Node temp2=head;
		for(int i=1; i<=n-1; i++)
		{
			temp=temp.next;
		}
		for(int i=1; i<=t-k-1; i++)
		{
			temp1=temp1.next;
		}
		while(temp2.next!=null)
		{
			temp2=temp2.next;
		}
		//System.out.println("\n"+temp.data);
		//System.out.println(temp1.data);
		//System.out.println(temp2.data);
		temp2.next=temp.next;
		temp.next=temp1.next;
		temp1.next=null;
	}
}
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of nodes: ");
		int N=sc.nextInt();
		for(int i=0; i<N; i++)
		{
			System.out.print("Enter the Data "+(i+1)+":");
			Node.insertData(sc.nextInt());	
		}
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.print("Enter the value of k: ");
		int k=sc.nextInt();
		System.out.print("Initially the Linked List is: ");
		Node.printNodes();
		System.out.print("After adding last k nodes at nth position, Linked List is: ");
		Node.MoveNodes(Node.head,k,n);
		Node.printNodes();
		
	}
}