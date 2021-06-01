class A
{
	public static void main(String args[])
	{
		int R,C;
		System.out.println("Enter the number of rows and columns: ");
		int R=sc.nextInt();
		int C=sc.nextInt();
		int M[][]=new int[R][C];
		System.out.println("Enter the elements of the Matrix: ");
		for(int i=0; i<R; i++)
		{
		   for(int j=0; j<C; j++)
		   {
			M[i][j]=sc.nextInt();
		   }
		}
	}
}