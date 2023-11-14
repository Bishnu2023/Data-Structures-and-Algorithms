import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class A
{
	public int[] findOriginalArray(int[] changed)
	{
		int[] original=new int[changed.length/2];
		List<Integer> al=new ArrayList<>();
		for(int i=0; i<changed.length; i++)
		{
			al.add(changed[i]);
		}
		Collections.sort(al);
		int k=0;
		for(int i=0;i<al.size();;i++)
		{
			int index=al.indexOf(2*al.get(i));
			if(index>=0 && al.get(i)!=-1)
			{
				original[k++]=al.get(i);
				al.set(index,-1);
			}
			System.out.println(al);
		}
		return original;
		
	}
	public static void main(String args[])
	{
		A obj=new A();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N:");
		int N=sc.nextInt();
		int A[]=new int[N];
		System.out.print("Enter the elements of Changed Array: ");
		for(int i=0; i<N; i++)
		{
			A[i]=sc.nextInt();	
		}
		int result[]=obj.findOriginalArray(A);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}
