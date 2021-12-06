package recursion;

import java.util.Scanner;

public class FindIsArraySorted {

	public static void main(String[] args) {
		FindIsArraySorted obj = new FindIsArraySorted();
		obj.callmethod();
	}

	private void callmethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of values");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = isArraySorted(arr, length);
		if (length == 1 || length == 0)
			System.out.println("it has only one number ");
		if (result == 0)
			System.out.println("Given Array is Sorted");
		if (result == 1) {
			System.out.println("Given Array is Not Sorted");
		}
	}

	private int isArraySorted(int[] arr, int length) {
		if (length == 1)
			return 0;
		else
			return arr[length - 1] >= arr[length - 2] ? isArraySorted(arr, length - 1) : 1;
	}
}

/*
 * RESULT: Enter Total Number of values 5 Enter Values 1 2 3 4 5 Given Array is
 * Sorted
 * 
 * 2nd: Enter Total Number of values 5 Enter Values 0 3 6 4 8 Given Array is Not
 * Sorted
 */
