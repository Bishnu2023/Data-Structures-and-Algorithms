import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
class A
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.print("Enter the elements: ");
		String input=br.readLine();

		String s[]=input.split(" ");
                
		ArrayList<Integer> al=new ArrayList<>();

		for(int i=0; i<s.length; i++)
		{
			al.add(Integer.parseInt(s[i]));
		}

		/*Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}*/
		System.out.println(al);

		System.out.print("\nEnter the window size: ");
		int window_size=Integer.parseInt(br.readLine());
		int max_sum=Integer.MIN_VALUE;
		int sum=0;

		System.out.println("The Maximum Sum is: "+max_sum);

		for(int i=0; i<window_size; i++)
		{
			sum=sum+al.get(i);
		}

		max_sum=Integer.max(sum,max_sum);
		
		for(int i=1; i<=al.size()-window_size; i++)
		{
			sum=sum-al.get(i-1)+al.get(i+window_size-1);
			max_sum=Integer.max(sum,max_sum);
		}

		System.out.println("Maximum Sum of Subarray of Window Size 3: "+max_sum);
	}
}
