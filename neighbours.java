//Given a 2D array filled with 0 or 1, the condition was that the cell will remain 1 only 
//if 2 or 3 of its neighbors are 1 otherwise, it will become 0.
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and column: ");
		int r=sc.nextInt(); int c=sc.nextInt();
		int M[][]=new int[r][c];
		System.out.println("Enter the elements of the matrix: ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				M[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Elements of the Matrix are: \n");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
		//Printing the non-boundary Elements	
		for(int i=1; i<=r-2; i++)
		{
			for(int j=1; j<=c-2; j++)
			{
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
	}
}