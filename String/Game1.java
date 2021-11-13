package String;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	int length;

	public static void main(String[] args) {
		Game1 obj = new Game1();
		int[] arr1 = obj.getRandomNo(0, 9);
		obj.checkNo(arr1);

	}

	private char[] findPosition(int arr1[], int arr2[]) {
		// TODO Auto-generated method stub
		char[] arr3 = new char[arr1.length];

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] == arr2[i]) {
				arr3[i] = 'c';
			} else {
				arr3[i] = 'x';
			}
			for (int j = 0; j < arr3.length; j++) {
				if (arr2[i] == arr1[j] && arr3[i] != 'c') {
					arr3[i] = 'p';
				}
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
		System.out.println();

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 'x' || arr3[i] == 'p') {
				System.out.println("Sorry! Try Again");
				System.out.println();
				break;
			}
		}
		return arr3;

	}

	private void checkNo(int[] arr1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + length + " Digits Number" + " You Think What is Random No");
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Entered No for Checking is: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();

		while (true) {
			char[] arr3 = findPosition(arr1, arr2);
			int space = 0;
			for (int i = 0; i < arr3.length; i++) {
				if (arr3[i] == 'c') {
					space++;
				}
			}
			if (space == length) {
				System.out.println("Congrates!!! You Beauty Found out Hidden Number");
				break;
			} else {
				System.out.println("Re-Enter P & X Positions");
				for (int i = 0; i < arr2.length; i++) {
					arr2[i] = sc.nextInt();
				}
				System.out.println("Entered No for Checking is:");
				for (int i = 0; i < arr2.length; i++) {
					System.out.print(arr2[i]);
				}
			}
		}
	}

	private int[] getRandomNo(int minRange, int maxRange) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		System.out.println("Enter the positive number length");
		length = sc.nextInt();
		int arr1[] = new int[length];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rm.nextInt(maxRange - minRange) + minRange;
		}

//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i]);
//		}
//		System.out.println();
		System.out.println();
		return arr1;
	}

}

/*
Result:
Enter the positive number length
4

Enter 4 Digits Number You Think What is Random No
1
3
6
3
Entered No for Checking is: 
1363
cpxc
Sorry! Try Again

Re-Enter P & X Positions
1
0
3
3
Entered No for Checking is:
1033cxcc
Sorry! Try Again

Re-Enter P & X Positions
1
1
3
3
Entered No for Checking is:
1133cpcc
Sorry! Try Again

Re-Enter P & X Positions
1
2
3
3
Entered No for Checking is:
1233cxcc
Sorry! Try Again

Re-Enter P & X Positions
1
3
3
3
Entered No for Checking is:
1333cpcc
Sorry! Try Again

Re-Enter P & X Positions
1
4
3
3
Entered No for Checking is:
1433cxcc
Sorry! Try Again

Re-Enter P & X Positions
1
5
3
3
Entered No for Checking is:
1533cccc
Congrates!!! You Beauty Found out Hidden Number
*/