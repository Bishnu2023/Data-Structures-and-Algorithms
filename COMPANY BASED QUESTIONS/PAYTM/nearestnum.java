//PAYTM-Q1
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,m;
		System.out.print("Enter the value of num: ");
		num=sc.nextInt();
		System.out.print("Enter the value of m: ");
		m=sc.nextInt();
		System.out.print("The nearest number divisible by m is: ");
		for(int i=num,j=num; ;i++,j--)
		{
			if(i%m==0)
			{
				System.out.println(i); break;
			}
			else if(j%m==0)
			{
				System.out.println(j); break;
			}
		}
	}
}