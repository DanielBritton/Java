import java.util.*;
public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of trials followed by the Probability of heads as a percentage: ");
		double trials = scan.nextInt();
		double probability = scan.nextInt();
		scan.close();
		double count = 0;
		double simulations = 1000;

		for (int i = 0; i < simulations; i++) {
			double total = 0;
			for (int j = 0; j < trials; j++) {
				if (Math.random() < probability/100.0) {
					total++;
				}
			}

			if (total > trials / 2.0) {
				count++;
			}
		}		
		System.out.println("P Heads: "+count*100/simulations);
	}
}
