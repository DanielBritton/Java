import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		boolean p[] = new boolean[1001];
		for (int i = 0; i < p.length; i++) {
			p[i] = false;
		}

		for (int i = 2; i < p.length; i++) {
			boolean prime = true;
			for (int j = 2; (j < i) && (prime == true); j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime == true) {
				p[i] = true;
			}
		}

		int res = 0;
		int n1 = 0;
		int n2 = 0;

		if (p[num] == true) {
			n1 = num;
		}

		for (int i = 1; res == 0; i++) {
			if ((p[num - i] == true) && (n1 == 0)) {
				n1 = num - i;
			}
			if ((p[num + i] == true)&&(n2==0)) {
				n2 = num + i;
			}
			
			if ((n1 > 0) && (n2 > 0)) {
				res = n2 - n1;
			}
		}
		System.out.println("The number entered was "+num);
		System.out.println("The difference between primes "+n1+" and "+n2+" is "+res);
	}
}
