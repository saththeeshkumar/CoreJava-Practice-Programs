package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 60, 75, 21, 98, 45, 61, 54, 6, 78, 21 };
		// Arrays.sort(arr); OR
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		/*for (int tempr : arr) {
			System.out.println(tempr);
		}*/
		
		System.out.println("Enter The No for Checking");
		int key = sc.nextInt();
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == key) {
				System.out.println("Present");
				break;
			} else if (arr[mid] < key) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
	}
}
