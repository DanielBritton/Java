import java.util.*;
public class Solution {
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of trials followed by the streak number: ");
		int trials=scan.nextInt();
		int heads=scan.nextInt();
		scan.close();
		double count=0;
		double simulations=1000000;
		
		for(int i=0;i<simulations;i++){
			int click=0;
			int record=0;
			for(int j=0;j<trials;j++){
				if(Math.random()>0.5)
				{
					click++;
					if(click>record)
					{
						record=click;
					}
				}else{
					click=0;
				}
			}
			if(record>=heads)
			{
				count++;
			}
		}
		
		System.out.println(count*100/simulations);
	}
}
