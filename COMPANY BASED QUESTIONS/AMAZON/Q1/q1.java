//Next Greater Frequency Element
//https://www.geeksforgeeks.org/next-greater-frequency-element/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
class A
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of elements: ");
		int N=Integer.parseInt(br.readLine());
		//System.out.println("N="+N);
		System.out.print("Enter the elements of the array: ");
		String[] A=(br.readLine()).split(" ");
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0; i<A.length; i++)
		{	
			al.add(Integer.parseInt(A[i]));
		}
		ArrayList<Integer> freq=new ArrayList<>();
		for(int i=0; i<al.size(); i++)
		{
			freq.add(Collections.frequency(al,al.get(i)));
		}
		System.out.println("elements are: "+al);
		System.out.println("frequency of elements: "+freq);
		ArrayList<Integer> result=new ArrayList<>();
		for(int i=0; i<al.size() ; i++)
		{		
			int r=-1;
			for(int j=i+1; j<freq.size(); j++)
			{
				if(freq.get(j)>freq.get(i))
				{
					r=al.get(j);
					break;
				}
			}
			//System.out.println("i="+i);
			result.add(r);
		}
		System.out.println("The result is: "+result);
		
	}
}													
