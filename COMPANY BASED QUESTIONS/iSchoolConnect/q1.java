import java.io.BufferedReader;
import java.io.InputStreamReader;
class A
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String: ");
		String s=br.readLine();
		//String s="I am a Junior Research Scientist";
		String sp[]=s.split(" ");
		/*for(String s1: sp)
		{
			System.out.println(s1);
		}*/
		System.out.println("====String Pairs====\n\n");
		for(int i=0, j=i+1; i<=sp.length-2 ; i++,j++)
	        {
               		 System.out.println(sp[i]+" "+sp[j]);
       		}

	}
}

