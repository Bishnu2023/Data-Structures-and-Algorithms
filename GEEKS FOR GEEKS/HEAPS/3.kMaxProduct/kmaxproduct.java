//Heap-Maximum product of k integers in an array of positive Integers
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
			A[i]=sc.nextInt();
		}
		PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer k1,Integer k2)
			{
				return k2-k1;
			}
		});
		for(int i=0; i<n; i++)
		{
			pq.add(A[i]);
		}		
		//System.out.println(pq);
		System.out.print("Enter the value of k: ");
		int k=sc.nextInt(); 
		int count=1;
		int product=1;
		while(pq.size()!=0 && count<=k)
		{
			product*=pq.poll();
			count++;	
		}
		System.out.println("Maximum Product of "+k+" integers is: "+product);
	}
}