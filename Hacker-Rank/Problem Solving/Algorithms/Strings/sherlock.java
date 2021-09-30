//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
//Sherlock and the Valid String
import java.util.Scanner;
import java.util.Collections;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Comparator;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.next();
		ArrayList<Character> al=new ArrayList<>();		
		TreeMap<Character,Integer> tm=new TreeMap<>();
		TreeMap<Character,Integer> sorted=new TreeMap<Character,Integer>(new Comparator<Character>()
		{
			public int compare(Character k1,Character k2)
			{
				int value=tm.get(k1).compareTo(tm.get(k2));
				if(value==0)
				{
					return 1;
				}
				else
				{
					return value;
				}
			}
		});
		for(int i=0; i<s.length() ; i++)
		{
			al.add(s.charAt(i));
		}
		for(char ch: al)
		{
			tm.put(ch,Collections.frequency(al,ch));
		}
		sorted.putAll(tm);
		System.out.println(al);
		System.out.println(sorted);
		int val=sorted.getValue();
		System.out.println(val);
		int a[]=sorted.values
	}
}
