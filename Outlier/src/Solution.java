import java.util.*;
//LAB2: Find the outlier of 3 numbers
public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		scan.close();

		int avg = (n1 + n2 + n3) / 3;

		int OneDiff = Math.abs(n1 - avg);
		int TwoDiff = Math.abs(n2 - avg);
		int ThreeDiff = Math.abs(n3 - avg);

		if (OneDiff > TwoDiff && OneDiff > ThreeDiff) {
			System.out.println(n1);
		} else if (TwoDiff > OneDiff && TwoDiff > ThreeDiff) {
			System.out.println(n2);
		} else if (ThreeDiff > TwoDiff && ThreeDiff > OneDiff) {
			System.out.println(n3);
		} else {
			System.out.println("NA");
		}
	}
}
