package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRrecursion {

	public static void main(String[] args) {
		BinarySearchRrecursion obj = new BinarySearchRrecursion();
		int[] arr = obj.getValues();
		Arrays.sort(arr); 
		//int[] arr = {1,2,3,4,5};
		int key = obj.getKey();
		int result =obj.binarySearch(arr, key, 0, arr.length-1);
		if(result==-1) 
			System.out.println("The Number is Not Occured");
		else
			System.out.println("The Number is Ocuured in "+result+"th Position");

	}

	private int getKey() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value FOr Search");
		return sc.nextInt();
	}

	private int binarySearch(int arr[], int key, int start, int end) {

		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) 
				return mid;
			  if (arr[mid] > key) 
			return binarySearch(arr, key, start, mid-1);		
		  	return binarySearch(arr, key, mid+1, end);
		}
		return -1;

	}

	private int[] getValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total Values will be Given");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter No.of values");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

}
/*
RESULT:
Enter total Values will be Given
5
Enter No.of values
1
2
5
9
4
Enter value FOr Search
9
The Number is Ocuured in 4th Position
*/