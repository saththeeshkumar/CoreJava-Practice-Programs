package recursion;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Gcd obj = new Gcd();
		int[] arr = obj.getValues();
		int small = arr[0] > arr[1] ? arr[1] : arr[0];
		int Divisor = obj.gcd(arr, small, small);
		if (Divisor == -1)
			System.out.println("These Numbers Have NO Common Divisor");
		else
			System.out.println("Greatest Common divisor for Given Numbers: " + Divisor);
	}

	private int gcd(int[] arr, int divisor, int small) {
		if (divisor > 0) {
			if ((arr[0] % divisor == 0) && (arr[1] % divisor == 0)) {
				// System.out.println(divisor);
				return divisor;
			}
			return gcd(arr, divisor - 1, small);
		}
		return -1;
	}

	private int[] getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value");
		int first = sc.nextInt();
		System.out.println("Enter Second Value");
		int second = sc.nextInt();
		int[] arr = { first, second };
		return arr;
	}
}
/*
RESULT:
Enter First Value
56
Enter Second Value
24
Greatest Common divisor for Given Numbers: 8
*/