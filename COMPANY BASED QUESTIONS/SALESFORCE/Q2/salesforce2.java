//SalesForce-Q2
import java.util.Scanner;
class A
{
	static int count=0;
	static String keyword="car";
	static String temp="";
	static int M,N;
	public static int North(char[][] ch,int i,int j)
	{
		temp=""+ch[i][j];
		System.out.println("North: "+temp);
		if(j==0)
		{
			return 0;
		}
		else
		{
			if(keyword.equals(temp))
			{
				return 1;	
			}
			else if(!keyword.startsWith(temp))
			{
		                return 0;
			}
			else
			{
			     int result=0;
			     if(j-1>=0)
			     {
				result+=North(ch,i,j--);
			     	result+=South(ch,i,j--);
			     	result+=East(ch,i,j--);
			     	result+=West(ch,i,j--);
			     }
			     return result;
			}
		}
	}
	public static int South(char[][] ch,int i,int j)
	{	
		temp=""+ch[i][j];
		System.out.println("South: "+temp);
		if(j==ch.length-1)
		{
			return 0;
		}
		else
		{
			if(keyword.equals(temp))
			{
				return 1;	
			}
			else if(!keyword.startsWith(temp))
			{
		                return 0;
			}
			else
			{
			     int result=0;
			     if(j+1<N)
			     {
				result+=North(ch,i,j++);
			     	result+=South(ch,i,j++);
			     	result+=East(ch,i,j++);
			     	result+=West(ch,i,j++);
			     }
			     return result;
			}
		}
	}
	public static int West(char[][] ch,int i,int j)
	{
		temp=""+ch[i][j];
		System.out.println("West: "+temp);
		if(i==0)
		{
			return 0;
		}
		else
		{
			if(keyword.equals(temp))
			{
				return 1;	
			}
			else if(!keyword.startsWith(temp))
			{
		                return 0;
			}
			else
			{
			     int result=0;
			     if(i-1>=0)
			     {
				result+=North(ch,i--,j);
			        result+=South(ch,i--,j);
			        result+=East(ch,i--,j);
			        result+=West(ch,i--,j);
			     }
			     return result;
			}
		}
	}
	public static int East(char[][] ch,int i,int j)
	{
		temp=""+ch[i][j];
		System.out.println("East: "+temp);
		if(i==ch.length-1)
		{
			return 0;
		}
		else
		{
			if(keyword.equals(temp))
			{
				return 1;	
			}
			else if(!keyword.startsWith(temp))
			{
		                return 0;
			}
			else
			{
			     int result=0;
			     if(i+1<M)
			     {
			     	result+=North(ch,i++,j);
			     	result+=South(ch,i++,j);
			     	result+=East(ch,i++,j);
			     	result+=West(ch,i++,j);
			     }
			     return result;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		M=sc.nextInt();
		N=sc.nextInt();
		char ch[][]=new char[M][N];
		for(int i=0; i<M; i++)
		{
			for(int j=0; j<N; j++)
			{
				ch[i][j]=(sc.next()).charAt(0);
			}
		}
		System.out.println("The Elements of the Array are: ");
		for(int i=0; i<M; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0; i<1; i++)
		{
			for(int j=0; j<1; j++)
			{
				if(ch[i][j]==keyword.charAt(0))
				{
					count+=North(ch,i,j);
					count+=South(ch,i,j);
					count+=West(ch,i,j);
					count+=East(ch,i,j);
				}
			}
			System.out.println();
		}
		System.out.print("Count: "+count);
		
	}
}
