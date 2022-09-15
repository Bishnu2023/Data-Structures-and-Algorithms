
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n+n];
		int B[]=new int[n];
		int x=n;
		for(int i=0; i<n; i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			B[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			if(B[i].contains(A[i]))
			{
				A[i]=Math.max(A[i+1],B[i+1]);
			}
			else
			{
				A[n++]=B[i];
				A[n++]=B[i+1];
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(A[i]);
		}	
	}
}
