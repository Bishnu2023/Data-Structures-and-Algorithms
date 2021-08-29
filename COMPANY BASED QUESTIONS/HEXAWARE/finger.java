import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int result=0;
		int count=0;
		int i=-1;
		boolean flag=false;
                while(flag!=true)
		{
			for(i=i+1; i<5; i++)
			{
                              ++count;
			      System.out.print(count+" ");
                              if(count==n)
			      {
                                   result=i+1;
				   flag=true;
                                   break;
                              }
                        }
                        for(i=i-1; i>=0; i--)
			{
			      ++count;
			      System.out.print(count+" ");
                              if(count==n)
			      {
                                  result=i+1;
				  flag=true;
                                  break;
                              }
			}
		}
                System.out.println(result);

	}
}