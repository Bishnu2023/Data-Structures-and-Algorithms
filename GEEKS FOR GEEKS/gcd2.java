//BASIC EUCLIDEAN ALORITHM FOR GCD
import java.util.Scanner;
class A
{
	public static int gcd(int num1,int num2)
	{
		if(num1==0)
		{
			return num2;
		}
		return gcd(num1%num2,num2);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(===FINDING OF GCD====);
		System.out.println("Enter the numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=gcd(num1,num2);
	}
}
