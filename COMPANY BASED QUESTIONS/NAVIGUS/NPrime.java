//Sum of prime numbers below a certain number N
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N;
		System.out.print("Enter the value of N: ");
		N=sc.nextInt();
		int sum=0;
		System.out.println("The Prime Number's are: ");
		for(int i=2; i<=N; i++)
		{
		      int count=0;
		      for(int j=1; j<=i ;j++)
		      {
			    if(i%j==0)
			    {
				count++;
			    }
			    if(count>2)
			    {
				break;
			    }
		      }
		      if(count==2)
		      {
                          System.out.print(i+" ");
			  sum+=i;	
		      }
		}
		System.out.println("\nThe Sum is: "+sum);
	}
}
 