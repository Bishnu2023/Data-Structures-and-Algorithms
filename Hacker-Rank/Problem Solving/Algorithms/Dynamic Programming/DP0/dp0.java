//FINDING FACTORIAL OF A NUMBER USING DYNAMIC PROGRAMMING
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;
class A
{

	static HashMap<Integer, Integer> fact_map=new HashMap<>();
	
	public static int factorial(int num)
	{
		int fact;
		if(num==1)
		{
			return 1;
		}
		else if(fact_map.containsValue(num))
		{
			return fact_map.get(num);
		}
		else
		{
			fact=num*factorial(num-1);
			fact_map.put(num,fact);
			return fact;
		}
	}

	public static void main(String args[]) throws Exception
	{
		HashMap<Integer,Integer> factorials=new HashMap<>();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int testcases;
		System.out.print("Enter the number of test cases: ");
		testcases=Integer.parseInt(br.readLine());
		for(int i=0; i<testcases; i++)
		{
			System.out.print("Enter the factorial : ");
			int num=Integer.parseInt(br.readLine());
			int fact=A.factorial(num);
			System.out.println("The factorial of the number is: "+fact);
		}
		System.out.println(fact_map);
	}
}
