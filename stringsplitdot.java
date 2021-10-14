//Splitting a String from Dot Operator
import java.io.BufferedReader;
import java.io.InputStreamReader;
class A
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Decimal value: ");		
		String s=br.readLine();
		
		String res1[]=s.split("\\.");
		//System.out.println(res1.length);
		/*for(int i=0; i<res1.length ; i++)
		{
			System.out.print(res1[i]+" ");
		}*/
		System.out.println("Integer Part:"+res1[0]);
		//StringBuilder fp=new StringBuilder(res1[1]);
		res1[1]="0."+res1[1];
		System.out.println("Fractional Part: "+res1[1]);
	}
}
