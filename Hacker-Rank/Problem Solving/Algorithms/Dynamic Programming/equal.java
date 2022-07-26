import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class A
{
    public static int equal(List<Integer> arr)
    {
        System.out.print("The given Array List is: ");
        for(int x: arr)
        {
                System.out.print(x+" ");
        }
        return 0;
    }
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            List<Integer> al=new ArrayList<>();
            int size=sc.nextInt();
            for(int i=0; i<size; i++)
            {
                int num=sc.nextInt();
                al.add(num);
            }
            int result=equal(al);
            System.out.println("Result="+result);
    }
}
