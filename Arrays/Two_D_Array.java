package Array;

import java.util.Scanner;

public class Two_D_Array {
	Scanner sc = new Scanner(System.in);
int[][] marks=new int[2][5];
	public static void main(String[] args) {
		Two_D_Array obj=new Two_D_Array();
		obj.array();

	}

	private void array() {
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println();
		
		for(int row=0;row<marks.length;row++) {
			for(int col=0;col<marks[0].length;col++) {
				System.out.println("Enter Mark");
				marks[row][col]= sc.nextInt();
			}
		}
		for(int row=0;row<marks.length;row++) {
			for(int col=0;col<marks[0].length;col++) {
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
		}
		for(int row=0;row<marks.length;row++) {
			int total=0;
			for(int col=0;col<marks[0].length;col++) {
				total=total+marks[row][col];
			}
			System.out.println("Total "+total);
		}
	}

}
