/*Media.net Coding Question

-Closest point to Origin 

*We have a list A, of points (x,y) on the plane. Find the B closest points to the origin (0,0) 
Here, the distance between two points on a plane is the Euclidean distance.
You may return the answer in any order. The answer is guaranteed to be unique (except for the order that is in.) 
Note:- Euclidean distance between two points P1(x1,y1) and P2(x2,y2) is sqrt((x1-x2)^2+(y1-y2)^2).

For Example,
Input 1: 
A=[[1,3], [-2,2]]
B=1

Output 1:
[[-2,2]]
*/
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.Collections;
class A
{
	public static int[][] compute(int A[][],int B)
	{
		TreeMap<String,Double> tm=new TreeMap<>();
		for(int i=0; i<A.length; i++)
		{
		    double distance=0;
		    for(int j=0; j<2; j++)
		    {
			distance+=Math.pow(A[i][j],2);
		    }
		    distance=Math.sqrt(distance);
		    tm.put(""+A[i][0]+","+A[i][1],distance);
		}
		TreeMap<String,Double> sorted=new TreeMap<String,Double>(new Comparator<String>(){
			@Override
			public int compare(String k1,String k2)
			{
				int value=(tm.get(k1)).compareTo(tm.get(k2));
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
		sorted.putAll(tm);
		//System.out.println(tm);
		//System.out.println(sorted);
		int result[][]=new int[B][2];
		ArrayList<String> ks=new ArrayList<>(sorted.keySet());
		//System.out.println("Key Set (ArrayList): "+ks);
		for(int i=0; i<B; i++)
		{
			String sp[]=(ks.get(i)).split(",");
			result[i][0]=Integer.parseInt(sp[0]);
			result[i][1]=Integer.parseInt(sp[1]);
		}
		/*for(int i=0; i<B; i++)
		{
			System.out.println(result[i][0]+" "+result[i][1]);
		}*/
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of points: ");		
		int N=sc.nextInt();
		int A[][]=new int[N][2];
		System.out.println("Enter the points: ");
		for(int i=0; i<N; i++)
		{
	            for(int j=0; j<2; j++)
		    {
			A[i][j]=sc.nextInt();
		    }
		}
		System.out.print("Enter the value of B: ");
		int B=sc.nextInt();
		int result[][]=compute(A,B);
		System.out.println("The points are: ");
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<2 ;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
 	
	}
}
