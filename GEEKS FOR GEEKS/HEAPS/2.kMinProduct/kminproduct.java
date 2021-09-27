//Heap-Minimum product of k integers in an array of positive Integers
import java.util.Scanner;
import java.util.PriorityQueue;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the Array: ");
		int n=sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		int A[]=new int[n];
		for(int i=0; i<n; i++)
		{
			A[i]=sc.nextInt();
		}
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0; i<n; i++)
		{
			pq.add(A[i]);
		}
		System.out.print("Enter the value of k: ");
		int k=sc.nextInt();
		int product=1;
		int count=1;
		while(pq.size()!=0 && count<=k)
		{
			//System.out.print(pq.poll()+" ");
			//System.out.print(pq.peek()+" ");
			product*=pq.peek();
			pq.remove();
			count++;
		}
		System.out.println("Minimum Product of "+k+" integers is: "+product);
	}
}