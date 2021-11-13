package Array;

import java.util.Scanner;

public class Jagged_Array_3_Dimension {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row value ");
		int row = sc.nextInt();
		//System.out.println("Enter column values for "+ row+ " Rows");
		int[][] a=new int[row][];
		for(Integer i =1;i<=row;i++) {
			System.out.println("Enter values for "+i+" row");
		int col = sc.nextInt();
		a[i-1]=new int[col];
		}

		System.out.println("Enter values for created array");
		for(int row1=0;row1<a.length;row1++) {
			for(int col=0;col<a[row1].length;col++) {
				a[row1][col] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(int row1=0;row1<a.length;row1++) {
			for(int col=0;col<a[row1].length;col++) {
				System.out.print(a[row1][col]+" ");
			}
			System.out.println();
		}
	}

}

/*
Result:
	3
	Enter values for 1 row
	1
	Enter values for 2 row
	2
	Enter values for 3 row
	3
	Enter values for created array
	1

	2
	3

	4
	5
	6

	1 
	2 3 
	4 5 6 
*/