import java.math.BigInteger;
class A
{
	public static void main(String args[])
	{
		//int a=10;
		//int b=1010;
		
		BigInteger a=new BigInteger(""+10);
		BigInteger b=new BigInteger(""+1010);
		//BigInteger i;
		
		//int c=a<<b;

		//System.out.println(c);
		
		BigInteger bi=new BigInteger(""+a);
		BigInteger result=new BigInteger("0");
		//System.out.println(bi.intValue());

		for(int i=0; i<=314159; i++)
		{
			System.out.println(a.xor(b.shiftLeft(i)));
			result.add(a.xor(b.shiftLeft(i)));
		}
		System.out.println(result);
	}
}
