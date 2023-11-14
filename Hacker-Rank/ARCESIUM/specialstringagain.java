import java.util.BufferedReader;
import jsva.util.InputStreamReader;
class A
{
	public static void main(String args[])
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n=br.readLine();
		String s=br.readLine();
		System.out.println("n="+n);
		System.out.println("s="+s);
	}
}
