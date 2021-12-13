/*
	Given two integers a and b. You can do one operation ( eg x to x/2 )to any of the one integers at a time. 
	Calculate the minimum operations required to make both integers equal. 
	eg - 10 75
	minimum operations = 7 ;	
*/
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a and b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min_operations=0;
		while(a!=b)
		{
			if(a>b)
			{
				a=a/2;
			}
			else
			{
				b=b/2;
			}
			min_operations++;
			System.out.println("Operation "+min_operations+":"+ +a+" "+b);
		}
		System.out.println("Minimum Operations: "+min_operations);
	}
}
