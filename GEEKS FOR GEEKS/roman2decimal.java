//ROMAN NUMBER TO DECIMAL NUMBER
import java.util.Scanner;
class A
{
	public static int value(char ch)
	{
		if(ch=='I')
		{
			return 1;
		}
		else if(ch=='V')
		{
			return 5;
		}
		else if(ch=='X')
		{
			return 10;
		}	
		else if(ch=='C')
		{
			return 100;
		}
		else if(ch=='D')
		{
			return 500;
		}
		else if(ch=='M')
		{
			return 1000;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int testcases;
		System.out.print("Enter the number of test cases: ");
		testcases=sc.nextInt();
		for(int t=0; t<testcases; t++)
		{
			int sum=0;
			String romanNumber="";
			System.out.print("Enter the Roman Number: ");
			romanNumber=sc.next();
			System.out.println("The Roman Number is: ");
			for(int i=0; i<romanNumber.length(); )
			{
				System.out.print(romanNumber.charAt(i)+" ");
				int v1=value(romanNumber.charAt(i));
				int v2=0;
				if(i+1<romanNumber.length())
				{
			     		v2=value(romanNumber.charAt(i+1));
			     		if(v1>=v2)
			     		{
						sum=sum+v1;
						i++;
			     		}
			     		else
			     		{
				 		sum=sum+v2-v1;
				 		i=i+2;
			     		}
		        	}
				else
				{
					sum=sum+v1;
					i++;
				}
				System.out.println("Value: "+sum);
			}
			System.out.println("The Decimal Number is: "+sum);
		  }
		
	}
}
