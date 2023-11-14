import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Iterator;
class A
{
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.push("Rohit Sharma");
		ll.push("Shubman Gill");
		ll.push("Virat Kohli");
		ll.push("Shreyas Iyer");
		ll.push("KL Rahul");
		System.out.println(ll);

		Iterator<String> it=ll.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
