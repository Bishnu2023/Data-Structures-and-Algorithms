//TreeMap- Sort the Keys based on Values by Using Comparator Interface
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		System.out.print("Enter the number of Students: ");		
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter Roll No: ");
			int rollno=sc.nextInt();
			System.out.print("Enter Marks: ");
			int marks=sc.nextInt();
			tm.put(rollno,marks);
		}
		System.out.println("======RESULT SORTED BY ");
		System.out.println(tm);	
		TreeMap<Integer,Integer> sorted=new TreeMap<>(new Comparator<Integer>() 
		{
			
			@Override
			public int compare(Integer k1,Integer k2)
			{
				int value=tm.get(k1).compareTo(tm.get(k2));
				//System.out.println(k1+" "+k2+" "+value);
				if(value==0)
				{
					return 1;
				}
				else
				{
					return -1*value;
				}
			}		
		});
		sorted.putAll(tm);
		//System.out.println(sorted);
		System.out.println("======RESULT SORTED BY MARKS======");	
	}
}
	
