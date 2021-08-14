//NUMBER OF OCCURENCES OF 2 AS A DIGIT IN NUMBERS FROM 0 TO N
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N;
		System.out.print("Enter the value of n: ");
		N=sc.nextInt();
		String s="";
		for(int i=0; i<=N; i++)
		{
		    s=s+i;	
		}
		System.out.println(s);
		ArrayList<Character> al=new ArrayList<>();
		for(int i=0; i<s.length(); i++)
		{
		    	al.add(s.charAt(i));
		}
		System.out.println(al);
		int frequency=Collections.frequency(al,'2');
		System.out.println("Occurence of 2: "+frequency);
	}
}