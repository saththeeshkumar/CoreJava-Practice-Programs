package Array;

import java.util.Scanner;

public class AddOfMultidimensional {
int row,col;
	public static void main(String[] args) {
		AddOfMultidimensional obj = new AddOfMultidimensional();
		int[][] given_array =obj.Get_matrix();
		System.out.println();
		obj.addDiagonal_FromTopLeft(given_array);
		System.out.println();
		obj.addDiagonal_FromTopRight(given_array);
		System.out.println();
		obj.addRowvalues(given_array);
		System.out.println();
		obj.addcolvalues(given_array);
		
	}

	private void addcolvalues(int[][] given_array) {
		int total = 0;

		for(int i = 0;i<given_array.length;i++) {
			for(int j = 0;j<given_array[i].length;j++) {
			    total =	given_array[j][i]+total;
			}
			System.out.println("The total of col "+(i+1));
		    System.out.println(total);
		    total = 0;
			System.out.println();
		}
	}

	private void addRowvalues(int[][] given_array) {
		int total = 0;

		for(int i = 0;i<given_array.length;i++) {
			for(int j = 0;j<given_array[i].length;j++) {
			    total =	given_array[i][j]+total;
			}
			System.out.println("The total of Row "+(i+1));
		    System.out.println(total);
		    total = 0;
			System.out.println();
		}
		
	}

	private void addDiagonal_FromTopLeft(int[][] given_array) {
		System.out.println("Result of Add for Diagonal_FromTopLeft");
		int total = 0;
		for(int i = 0;i<given_array.length;i++) {
			for(int j = 0;j<given_array[i].length;j++) {
				if(i==j) {
					 total=given_array[i][j]+total;
					 j=given_array[i].length;
				}
			}
		}
			System.out.println(total);
	}

	private void addDiagonal_FromTopRight(int[][] given_array) {
		System.out.println("Result of Add for Diagonal_FromTopRight ");
		int total = 0;
		int j =given_array.length-1;
		for(int i = 0;i<given_array.length;i++) {
			 total=given_array[i][j]+total;
	         j--;		
		}
			System.out.println(total);
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
		    System.out.println();
            System.out.println("The given Matrix");
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		return arr;
	}
		
	}


