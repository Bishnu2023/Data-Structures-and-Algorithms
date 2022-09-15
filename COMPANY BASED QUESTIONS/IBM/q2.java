import java.util.*;
import java.math.BigInteger;
class A
{
	public static void main(String args[])
	{
		List<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		long sum=0;
		for(int x:al)
		{
			BigInteger b=new BigInteger(""+x);
			if(b.isProbablePrime(1))
			{
				sum=sum+(long)x;
			}
		}
		System.out.println(sum);		
	}
}
