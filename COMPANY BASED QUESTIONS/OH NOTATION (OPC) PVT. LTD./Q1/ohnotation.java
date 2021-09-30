//Big Oh Notation (OPC) Pvt. Ltd.
/*
	Write a function to find the longest common prefix string amongst an array of Strings
	
	If there is no common prefix, return an empty string "".

	Example 1:
	Input: strs=["flower","flow","flight"]
	Output: "fl"

	Example 2:
	Input: strs=["dog","racecar","car"]
	Output:""
*/
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N=sc.nextInt();
		String s[]=new String[N];
		System.out.print("Enter the elements of the String array: ");
		for(int i=0; i<N; i++)
		{
			s[i]=sc.next();
		}
		System.out.print("The elements of the String array are: ");
		for(int i=0; i<N; i++)
		{
			System.out.print(s[i]+" ");
		}
		String start=s[0];
		boolean flag=true;
		for(int i=1; i<=start.length(); i++)
		{
			String substring=start.substring(0,i);
			String result="";
			for(int j=1; j<N; j++)
			{
				if(s[j].startsWith(substring)==false)
				{
					result=start.substring(0,i-1);
					flag=false;
					break;
				}
			}
			if(flag==false)
			{
				if(result.length()==0)
				{
					result="***No Common Prefix***";
				}
				System.out.println("\nThe Longest Common Prefix is: "+result);
				break;
			}
		}
	}
}
//O(M*(N-1))
//O(M*N)
