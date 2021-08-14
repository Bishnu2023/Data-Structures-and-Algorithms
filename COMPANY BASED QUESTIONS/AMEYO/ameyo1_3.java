//SEARCH IN ROTATED SORTED ARRAY
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
import java.util.Scanner;
import java.util.TreeMap;
class A
{
	public static int search(int[] nums, int target)
	{
	     TreeMap<Integer,Integer> tm=new TreeMap<>();
	     for(int i=0; i<nums.length; i++)
	     {
		 tm.put(nums[i],i);
	     }
	     if(tm.containsKey(target))
	     {
		return tm.get(target);
	     }
	     else
	     {
		 return -1;
	     }
	}
	public static void main(String args[])
	{
	     int testcases;
	     Scanner sc=new Scanner(System.in);
	     System.out.print("Enter the number of testcases: ");
	     testcases=sc.nextInt();
	     for(int i=0; i<testcases; i++)	
	     {
		 System.out.print("Enter the no. of elements in the array: ");
		 int N=sc.nextInt();
		 int A[]=new int[N];
		 int target;
		 System.out.print("Enter the elements of the Array: ");
		 for(int j=0; j<N; j++)
		 {
			A[j]=sc.nextInt();
		 }
		 System.out.print("Enter the target element: ");
		 target=sc.nextInt();
		 int result=search(A,target);
		 System.out.println("Result: "+result);
		 System.out.println();
	     }
	}
}