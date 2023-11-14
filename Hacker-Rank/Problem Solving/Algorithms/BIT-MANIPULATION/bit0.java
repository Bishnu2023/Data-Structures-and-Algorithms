import java.io.BufferedReader;
import java.io.InputStreamReader;
class A
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s="";
		System.out.print("Enter the value of A & B: ");
		s=br.readLine();
		String s1[]=s.split(" ");
		int A=Integer.parseInt((s1[0]));
		int B=Integer.parseInt((s1[1]));

		System.out.println("Before Swapping, The value of A and B are: "+A+" "+B);

		//Performing XOR Operations

		A=A^B;
		B=A^B;
		A=A^B;

		System.out.println("After Swapping, The value of A and B are: "+A+" "+B);
	}
} 
