//PAYTM-Q2
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
	static void removeDuplicate(Node head)
	{
		Node temp=head;
		Node temp1=temp.next;
		while(temp1!=null)
		{
			if(temp.data==temp1.data)
			{
			       temp.next=temp1.next;
			       temp1=temp.next;
                        }
			else
			{
			       temp=temp1;
			       temp1=temp1.next;
			}
		}
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
		//System.out.print("Enter the value of n: ");
		//int n=sc.nextInt();
		//System.out.print("Enter the value of k: ");
		//int k=sc.nextInt();
		System.out.println("Initially the Linked List is: ");
		Node.printNodes();
		Node.removeDuplicate(Node.head);
		System.out.println("After removing duplicates the Linked List is: ");
		Node.printNodes();
		
	}
}