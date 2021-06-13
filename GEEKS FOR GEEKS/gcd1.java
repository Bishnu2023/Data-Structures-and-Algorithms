//GCD OF A NUMBER
import java.util.Scanner;
class A
{
	public static int gcd(int num1,int num2)
	{
		int times=0;
		int min=0,max=0,gcd=0;
		if(num1==num2)
		{
			gcd=num1;
		}
		else if(num1>num2)
		{
			min=num2;
			max=num1;
		}
		else if(num1<num2)
		{
			min=num1;
			max=num2;
		}
		for(int i=1 ; i<=min; i++)
		{
			if(max%i==0)
			{
				gcd=i;
			}
			times++;
		}
		System.out.println("No. of Times: "+times);
		return gcd;

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter two numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("The numbers are "+num1+" and "+num2);
		System.out.println("The GCD of two numbers is: "+gcd(num1,num2));		
	}
}
