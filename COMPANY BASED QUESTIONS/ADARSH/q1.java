import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
class ABC
{

	public static int GetAnswer(int N, int Q, List<Integer> A, ArrayList<ArrayList<Integer>> Queries)
	{
		int result=0;
		
		for(int i=0; i<Q; i++)
		{
			int n1=Queries.get(i).get(0);
			int n2=Queries.get(i).get(1);
			n1=n1-1;
			n2=n2-1;
			TreeSet<Integer> ts=new TreeSet<>();
			for(int j=n1; j<=n2; j++)
			{
				ts.add(A.get(j));
			}
			result=result+ts.size();
		}
		return result;
	}
	public static void main(String args[])
	{
		int N=3;
		int Q=2;
		List<Integer> A=new ArrayList<>();
		ArrayList<ArrayList<Integer>> Queries=new ArrayList<ArrayList<Integer>>();
		A.add(1);
		A.add(2);
		A.add(1);
		Queries.get(0).add(1);
		Queries.get(0).add(2);
		Queries.get(1).add(2);
		Queries.get(1).add(3);
		int result=ABC.GetAnswer(N, Q, A, Queries);
		System.out.println(result);
		
	}
}
