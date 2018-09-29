import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		int greatest = n;

		for (int i = 0; i < 32; i++) {
			if (n << i > greatest) {
				greatest = n << i;
			}
			if (n >> i > greatest) {
				greatest = n >> i;
			}
			if (n >>> i > greatest) {
				greatest = n >>> i;
			}
		}
		System.out.println(greatest);
	}
}
