//Converting a Fraction into Decimal and then separating the Integer Part and the Fractional Part
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
class A
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String fraction="";
		System.out.print("Enter the Fraction: ");
		fraction=br.readLine();
		System.out.println("The Fraction is: "+fraction);
		String f[]=fraction.split("/");
		double r=Double.parseDouble(f[0])/Double.parseDouble(f[1]);
		System.out.println(r);
		String res1=""+r;
		System.out.println("res1: "+res1);
		String result[]=res1.split("\\.");
		//Displaying the result array
		/*for(int i=0; i<result.length ; i++)
		{
			System.out.println(result[i]+" ");
		}*/
		System.out.println("Integer Part: "+result[0]);
		result[1]="0."+result[1];
		System.out.println("Fractional Part: "+result[1]);
	}
}
