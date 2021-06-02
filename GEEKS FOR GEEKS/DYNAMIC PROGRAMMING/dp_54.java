import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void printMaxSubSquare(int M[][])
	{
		int R=M.length;
		int C=M[0].length;
		System.out.println(R+" "+C);	
	}
	public static void main(String args[])
	{
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
		System.out.println("The Elements of the Array are: ");
		for(int i=0; i<R; i++)
		{
	           for(int j=0; j<C; j++)
		   {
		   	System.out.print(M[i][j]+" ");
		   }
		   System.out.println();
		}

	}
}