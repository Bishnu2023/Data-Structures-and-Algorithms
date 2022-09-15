import java.util.ArrayList;
class A
{
	public static void main(String args[])
	{
		int num=10;
		int[][] soldierPosition={{1,5},{6,10}};
		int posSoldier;

		/*for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.println(soldierPosition[i][j]);
			}
		}*/
		
		
		int answer=0;

		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1; i<=num; i++)
		{
			al.add(i);
		}
		for(int i=0; i<soldierPosition.length; i++)
		{
			for(int j=0; j<2 ; j++)
			{
				int pos1=soldierPosition[i][0];
				int pos2=soldierPosition[i][1];
				al.remove(pos1);
				al.remove(pos2);
				al.add(pos1,soldierPosition[i][1]);	
				al.add(pos2, soldierPosition[i][0]);
			}
		}
		System.out.println(al);

	}
}

