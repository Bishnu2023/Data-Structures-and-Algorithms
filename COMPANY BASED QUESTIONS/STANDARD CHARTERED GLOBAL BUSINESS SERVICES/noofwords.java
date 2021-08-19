import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> testcases=new ArrayList<>();
		ArrayList<Integer> result=new ArrayList<>();
		testcases.add("How many eggs are in a half-dozen, 13?");
		testcases.add("he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?");
		testcases.add("b? Dl )B 4(V! A. MK, YtG ](f 1m )CNxuNUR {PG?");
		testcases.add("jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.");
		testcases.add(")}OJR 92ww. z )UPl 49e ]S  g. zrZEnQ  D. FoKp ]ow 1EceB 3oK }w ]CA? L 3LPbDN! trqJY 0sBMM. Nwn");
		result.add(7);
		result.add(21);
		result.add(5);
		result.add(21);
		result.add(8);
		int c=0;
		for(String s: testcases)
		{
			int count=0;
			s=s.replaceAll("  "," ");
			System.out.println(s);
			String sp[]=s.split(" ");
			for(int i=0; i<sp.length; i++)
			{
				sp[i]=sp[i].replaceAll("[-,?.!]+","");
				boolean r=Pattern.matches("[a-zA-Z]+",sp[i]);
				//System.out.println(sp[i]+" "+Pattern.matches("[a-zA-Z]+",sp[i]));
				if(r==true)
				{
					count++;
				}
				
			}
			System.out.println("Expected Output: "+result.get(c));
			System.out.println("Your Output: "+count);
			if(result.get(c++)==count)
			{
				System.out.println("Test Case Passed");	
			}
			else
			{
				System.out.println("Test Case Failed");
			}
			System.out.println();
		}		
	}
}