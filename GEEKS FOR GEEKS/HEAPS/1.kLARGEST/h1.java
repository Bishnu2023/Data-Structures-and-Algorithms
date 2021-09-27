//Find k numbers with most occurrences in the given array
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");		
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.print("The elements of the array are: ");
		/*for(int i=0; i<n; i++)
		{
			System.out.print(A[i]+" ");
		}*/
		ArrayList<Integer> al=new ArrayList<>();
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0; i<n; i++)
		{
			al.add(A[i]);
			ts.add(A[i]);
		}
		//System.out.println(ts);
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		for(int x: ts)
		{
			tm.put(x,Collections.frequency(al,x));
		}
		System.out.println(tm);
		//We have to Sort Keys of the TreeMap based on Values using Comparator Interface
		Comparator<Integer> comp=new Comparator<Integer>()
		{
			public int compare(Integer k1,Integer k2)
			{
				System.out.println("Bishnu");
				int value=tm.get(k1).compareTo(tm.get(k2));
				if(value==0)
				{
					return 1;
				}
				else
				{
					return value;
				}
			}	
		};
		Map<Integer,Integer> Sorted=new TreeMap<Integer,Integer>(comp);
		System.out.println(comp);
		System.out.println(Sorted);
		
	}
}
