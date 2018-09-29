import java.util.*;
public class Solution {
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s[]=new String[scan.nextInt()];
		int num=scan.nextInt();
		for(int i=0;i<s.length;i++){
			s[i]=scan.next();
		}
		scan.close();	
		s=insertion(s);
		
		System.out.println(s[num]);
	}
	
	public static String[] insertion(String[] s){
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()==s[j].length())
				{
					if(s[i].compareTo(s[j])<0)
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
				else if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		return s;
	}
}
