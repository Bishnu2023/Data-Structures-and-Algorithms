import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2[]=new int[input1];
		for(int i=0; i<input1; i++)
		{
			input2[i]=sc.nextInt();
		}
		int result[]=binsort(input1,input2);
		for(int i=0; i<result.length; i++)
		{
			System.out.print(input2[i]+" ");
		}
	}
	public static int[] binsort(int input1,int[] input2)
	{
		int result[]=new int[input1];
		ArrayList<Integer> al=new ArrayList<>();
		TreeSet<Integer> tm=new TreeSet<>();
		for(int i=0; i<input2.length; i++)
		{
			al.add(input2[i]);
			tm.add(input2[i]);
		}
		System.out.
		/*ArrayList<Integer> unique=new ArrayList<>(tm);
		ArrayList<Integer> count1=new ArrayList<>();
		for(int x:unique)
		{
			int count=0;
			while(x!=0)
			{
				if(x%10==1)
				{
					count++;
				}
				x=x/10;
			}
			count1.add(count);
		}
		int x=0;
		int max=0;
        	while(max>=0)
		{
			max=Collections.max(count1);
        		int index=count1.lastIndexOf(max);
			int element=unique.get(index);
			int f=Collections.frequency(al,element);
			for(int i=0; i<f; i++)
			{
				result[x++]=element;
			}
			count1.set(index,-1);
        	}*/
		return result;
	}
}
