class A
{
	public static void main(String args[])
	{
		String time="23:59";
		String t1[]=time.split(":");
		int hour=Integer.parseInt(t1[0]);
		if(hour>=12 && hour<=23)
		{
			System.out.println("PM");
		}
		else
		{
			System.out.println("AM");
		}
	}
}
