import java.util.*;
public class Solution {
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int r=Integer.parseInt(scan.nextLine());
		
		String name[]=new String[n];
		int grade[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			name[i]=scan.nextLine();
			grade[i]=Integer.parseInt(scan.nextLine());
		}
		
		insertion(grade,name);	
		System.out.println(name[r]);
		
	}
	
	public static void insertion(int[] g,String[] n)
	{
		for(int i=0;i<g.length;i++)
		{
			for(int j=i+1;j<g.length;j++)
			{
				if(g[j]>g[i])
				{
					int t1=g[i];
					g[i]=g[j];
					g[j]=t1;
					
					String t2=n[i];
					n[i]=n[j];
					n[j]=t2;
				}
			}
		}
	} 
}
