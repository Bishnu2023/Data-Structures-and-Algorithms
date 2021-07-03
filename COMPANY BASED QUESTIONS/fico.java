import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
class A
{
	public static void main(String args[])
	{
		String matches[]={"India 3:2 England","England 2:1 Pakistan","India 4:2 Australia"};
		TreeMap<String,Integer> tm=new TreeMap<>();
		for(int i=0; i<matches.length; i++)
		{
			String s[]=matches[i].split("[ :]+");
			tm.putIfAbsent(s[0],0);
			tm.putIfAbsent(s[3],0);
			//System.out.println(tm);

				int points1=Integer.parseInt(s[1]);
				int points2=Integer.parseInt(s[2]);

				//System.out.println(points1+" "+points2);

				if(points1>points2)
				{
					tm.put(s[0],tm.get(s[0])+2);
				}
				else if(points1<points2)
				{
					tm.put(s[3],tm.get(s[3])+2);
				}
				else
				{
					tm.put(s[0],tm.get(s[0])+1);
					tm.put(s[3],tm.get(s[3])+1);
				}
				System.out.println(tm);
				
		}
		ArrayList<Entry<String,Integer>> al=new ArrayList<>(tm.entrySet());
		al.sort(Entry.comparingByValue());
		Collections.reverse(al);
		System.out.println(al);
		String result[]=new String[al.size()];
		int i=0;
		for(Entry<String,Integer> e: al)
		{
			result[i++]=e.getKey()+" "+e.getValue();
		}
		for(i=0; i<result.length; i++)
		{
			System.out.print(result[i]+" ");
		}
	
	}
}