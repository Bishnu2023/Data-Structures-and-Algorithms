import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Comparator;
import java.util.Collections;
class A
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		ArrayList<String> al=new ArrayList<>();
		ArrayList<String> result=new ArrayList<>();
		/*ArrayList<String> result=new ArrayList<String>(new Comparator<String>(){
			
			@Override
			public int compare(String s1,String s2)
			{
				if(s1.length()>s2.length())
				{
					return 0;
				}
			}
		});*/
		for(int i=0; i<s.length(); i++)
		{
		    for(int j=i+1; j<s.length()+1; j++)
		    {
			String sub=s.substring(i,j);			
			if(sub.length()%2==0)
			{
				al.add(sub);
			}
		    }
		}
		//System.out.println(al);
		for(String s1: al)
		{
			int sum1=0;
			int sum2=0;
			for(int i=0, j=s1.length()-1; i<j; i++, j--)
                        {
				sum1=sum1+Integer.parseInt(""+s1.charAt(i));
				sum2=sum2+Integer.parseInt(""+s1.charAt(j));
                        }
			if(sum1==sum2)
			{
				result.add(s1);
			}
		}
		Collections.sort(result, (a,b)->Integer.compare(b.length(),a.length()));
		System.out.println((result.get(0)).length());
		/*int length=(result.get(0)).length();
		for(int i=1; i<result.size(); i++)
		{
			if((result.get(i)).length()>length)
			{
				length=(result.get(i)).length();
			}
		}
		System.out.println(length);*/
	}
}
