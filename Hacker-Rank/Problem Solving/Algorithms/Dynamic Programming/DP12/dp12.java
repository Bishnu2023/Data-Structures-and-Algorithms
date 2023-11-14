import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;
//Here I will be using the concept of Sliding window
class A
{	
	/*static TreeMap<ArrayList<Integer>,Integer> tm=new TreeMap<ArrayList<Integer>,Integer>();
	public static boolean condition1(int num[])
	{
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum+=num[i];
		}
	}
	public static boolean condition2(int num[])
	{
		int sum=0;
		for(int i=0; i<4; i++)
		{
			sum+=num[i];
		}
	}
	public static boolean condition3(int num[])
	{
		int sum=0;
		for(int i=0; i<5; i++)
		{
			sum+=num[i];
		}
	}*/
	public static void main(String args[]) throws Exception
	{
		int n=283002;
		String sp[]=(""+283002).split(" ");
		System.out.println(sp);
		ArrayList<Integer> al=new ArrayList<>();
		TreeMap<ArrayList<Integer>, Integer> tm=new TreeMap<ArrayList<Integer>, Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		tm.put(al,3);
		System.out.println(tm);
		//boolean result1;
		//boolean result2;
		//boolean result3;
	}
}
