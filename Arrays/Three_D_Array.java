package Array;

import java.util.Scanner;

public class Three_D_Array {
	Scanner sc = new Scanner(System.in);
int[][][] marks=new int[2][3][4]; 
	public static void main(String[] args) {
		Three_D_Array objArray=new Three_D_Array();
		objArray.method();

	}

	private void method() {
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[0][0].length);
		System.out.println();
		
		for(int stud=0;stud< marks.length;stud++) {
			for(int month=0;month<marks[stud].length;month++) {
				for(int mark=0;mark<marks[stud][month].length;mark++) {
					System.out.println("Enter Mark");
					marks[stud][month][mark]=sc.nextInt();
				}
			}
		}
		System.out.println();
		
		for(int stud=0;stud< marks.length;stud++) {
			for(int month=0;month<marks[stud].length;month++) {
				for(int mark=0;mark<marks[stud][month].length;mark++) {
					System.out.print(marks[stud][month][mark]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
