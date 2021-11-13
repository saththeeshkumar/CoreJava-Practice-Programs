package Array;

import java.util.Scanner;

public class Transporse_Matrix {
	
	int row,col;

	public static void main(String[] args) {
		Transporse_Matrix obj = new Transporse_Matrix();
		int[][] given_array = obj.Get_matrix();
		obj.transporse_matrix(given_array);
	}

	private int[][] Get_matrix() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		 row = sc.nextInt();
		System.out.println("Enter the column");
		 col = sc.nextInt();
		 
		int[][] arr = new int[row][col];
		
		System.out.println("Enter values for Array");
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
	}
	
	private void transporse_matrix(int[][] given_array ) {
		
		System.out.println();
		
		System.out.println("The givem Matrix");
		
		for(int i = 0;i<given_array.length;i++) {
			for(int j = 0;j<given_array.length;j++) {
				
				System.out.print(given_array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] transporse_array = new int[row][col];
		for(int i = 0;i<given_array.length;i++) {
			for(int j = 0;j<given_array[i].length;j++) {
				transporse_array[i][j] = given_array[j][i];
			}
		}
		
		System.out.println("The Transporsed Array");
		
		for(int i = 0;i<given_array.length;i++) {
			for(int j = 0;j<given_array.length;j++) {
				
				System.out.print(transporse_array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
/*
Result:
	Enter the row
	3
	Enter the column
	3
	Enter values for Array
	1
	2
	3
	4
	5
	6
	7
	8
	9

	The givem Matrix
	1 2 3 
	4 5 6 
	7 8 9 

	The Transporsed Array
	1 4 7 
	2 5 8 
	3 6 9 
	*/