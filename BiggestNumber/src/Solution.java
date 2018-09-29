import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[scan.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		// Arrays.sort(a);
		a = insertion(a);
		// print out the nth biggest element of the array
		System.out.println(a[a.length - scan.nextInt()]);
	}

	// Insertion Sort Algorithm
	public static int[] insertion(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
