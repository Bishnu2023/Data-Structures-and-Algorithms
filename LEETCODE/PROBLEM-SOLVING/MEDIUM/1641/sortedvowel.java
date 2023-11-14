//Count Sorted Vowel String
import java.util.Scanner;
class A
{
	public int countVowelStrings(int n)
	{
		return n;
	}
	public static void main(String args[])
	{
		A obj=new A();
	     	Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the value of n: ");
		n=sc.nextInt();
		int result=obj.countVowelStrings(n);
		System.out.println("Result is: "+result);
	}
}
