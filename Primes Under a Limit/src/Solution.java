import java.util.*;
public class Solution {
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the upper limit of the search: ");
		int lim=scan.nextInt();
		scan.close();
		
		int count=0;
		for(int i=2;i<=lim;i++)
		{
			if(isPrime(i)==true) count++;
		}
		
		System.out.println("There are "+count+" Prime numbers below the limit "+lim);
	}
	
	public static boolean isPrime(int x)
	{
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
