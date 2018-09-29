import java.util.*;

public class Solution {
	public static void main(String args[]) {
		// Take in a String of digits to be verified using the Luhn Algorithm
		Scanner scan = new Scanner(System.in);
		String testString = scan.next();
		scan.close();
		// This is used to hold individual digits and perform required
		// operations before adding to count
		int digit = 0;
		// Used to count digits in testString after operations have been
		// performed on them
		int sum = 0;

		for (int i = testString.length() - 1; i >= 0; i--) {
			digit = Integer.parseInt(String.valueOf(testString.charAt(i)));
			// Checks if the String value must be multiplied by two and does
			// this when needed
			if (i % 2 != testString.length() % 2) {
				digit *= 2;
				if (digit > 9) {
					digit -= 9;
				}
			}
			sum += digit;
		}
		// Checking to see if sum+check digit equals 0
		if ((sum + (sum * 9) % 10) % 10 == 0) {
			System.out.println(testString + " is VALID");
		} else {
			System.out.println(testString + " is INVALID");
		}
	}
}
