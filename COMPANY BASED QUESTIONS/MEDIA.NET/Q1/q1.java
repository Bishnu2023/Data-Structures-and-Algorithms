/*
	Input1: 				Output1:
	==========				========
	A: "jdlidfa"				[1, 1, 0]
	B: ["daf", "ifd", "dxzjbltsmufythgm"]

	Input2:					Output1:
	==========				========
	A: "lrprpqejhh"				[2, 1]
	B: ["p", "pjeplqrr"]

*/
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class A
{
	public static int[] compute(String A, String B[])
	{
		int result[]=new int[B.length];
		ArrayList<ArrayList<Character>> sub_al=new ArrayList<ArrayList<Character>>();
		ArrayList<String> sub=new ArrayList<>();
		for(int i=0; i<A.length(); i++)
		{
			for(int j=i+1; j<A.length()+1; j++)
			{
				sub.add(A.substring(i,j));
			}
		}
		//System.out.println(sub);
		for(int i=0; i<sub.size(); i++)
		{
			ArrayList<Character> al=new ArrayList<>();
			for(int j=0; j<sub.get(i).length(); j++)
			{
				al.add(sub.get(i).charAt(j));
			}
			Collections.sort(al);
			sub_al.add(al);
		}	
		//System.out.println(sub_al);
		ArrayList<ArrayList<Character>> B_al=new ArrayList<ArrayList<Character>>();
		for(int i=0; i<B.length ; i++)
		{
			ArrayList<Character> al=new ArrayList<>();
			for(int j=0; j<B[i].length(); j++)
			{
				al.add(B[i].charAt(j));
			}
			Collections.sort(al);
			B_al.add(al);
		}
		//System.out.println(B_al);
		
		for(int i=0; i<B_al.size(); i++)
		{
			int count=0;
			while(sub_al.contains(B_al.get(i)))
			{
				sub_al.remove(sub_al.indexOf(B_al.get(i)));
				count++;
			}
			result[i]=count;
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String A: ");
		String A=sc.next();
		System.out.println("Enter the number of elements in B: ");
		int N=sc.nextInt();
		String B[]=new String[N];
		System.out.println("Enter the elements of B: ");
		for(int i=0; i<N ; i++)
		{
			B[i]=sc.next();
		}
		int result[]=compute(A,B);
		for(int i=0; i<result.length ; i++)
		{
			System.out.print(result[i]+" ");	
		}
		System.out.println();
		/*System.out.print("The Elements of B are: ");
		for(int i=0; i<N; i++)
		{
			System.out.print(B[i]+" ");
		}*/
	}	
}
