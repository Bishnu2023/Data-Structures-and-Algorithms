/*
Q2. You are given a string A of length N size consisting of only lower case letters
Now your task is to encrypt the string using the given algorithm

1. There are B iterations.
2. In each iteration, one index 'x' is chosen and then the following pseudocode runs:
// You are given 'x', 'a', 'b' and 't' in input in each iteration.
   j=x;
   for(int iter=1; iter<=t; iter++)
   {
	k=j;
	j=(a*j+b)%N;
	b=k;
   }
   swap(A[x],A[j]); 
*/
import java.util.Scanner;
class A
{
	public static String iteration(String A,int x,int a,int b,int t)
	{
		int N=A.length();
		int j=x;
		for(int iter=1; iter<=t; iter++)
		{
			int k=j;
			j=(a*j+b)%N;
			b=k;
		}
		//swap(A[x],A[j]);
		StringBuilder sb1=new StringBuilder(A);
		char ch1=A.charAt(x);
		char ch2=A.charAt(j);
		sb1.setCharAt(x,ch2);
		sb1.setCharAt(j,ch1);
		//System.out.println(sb1);
		return sb1.toString();
	}
	public static String compute(String A, int B, int C[][])
	{
		int x,a,b,t;
		for(int i=0; i<C.length ; i++)
		{
			x=C[i][0];
			a=C[i][1];
			b=C[i][2];
			t=C[i][3];
			A=iteration(A,x,a,b,t);
		}
		return A;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String A=sc.next();
		System.out.print("Enter the value of B: ");
		int B=sc.nextInt();
		int C[][]=new int[B][4];
		System.out.println("Enter the elements of array C: ");
		for(int i=0; i<B ; i++)
		{
			for(int j=0; j<4 ; j++)
			{
				C[i][j]=sc.nextInt();
			}
		}
		System.out.println("The resultant String is: "+compute(A,B,C));
	}
}
