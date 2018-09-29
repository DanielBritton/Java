import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		long n1 = 0;
		long n2 = 0;
		long n3 = 1;
		long res = fib(n, n1, n2, n3);
		System.out.println("The " + n + " term in the fibonnaci sequence is " + res);
	}

	public static long fib(int n, long n1, long n2, long n3) {
		long res = 0;
		if (n == 0) {
			return n3;
		} else {
			res = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = res;
			n--;
			return fib(n, n1, n2, n3);
		}
	}
}
