/*
Company Name: Scholar@SAP 	
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
class A
{
	public static void Compute(List<Integer> al)
	{
		ArrayList<Integer> result=new ArrayList<Integer>(new Comparator<A>(){
			@Override
			public int compare(Integer k1,Integer k2)
			{
				if(k1==k2)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		});
		result.addAll(al);
		System.out.println(result);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the List: ");
		int N=sc.nextInt();
		List<Integer> al=new ArrayList<>(4);
		//System.out.println("List Size: "+al.size());
		System.out.print("Enter the elements of the List: ");
		for(int i=0; i<N; i++)
		{
			al.add(sc.nextInt());
		}
		//System.out.println(al);
		Compute(al);
	}
}
