package Array;

import java.util.Scanner;

public class My10thMarkTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of marks:");
		int count = sc.nextInt();
		int[] marks = new int[count];
		int total = 0;
		int highest = 0;
		int count2 = 0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter Mark");
			marks[i] = sc.nextInt();
			total = total + marks[i];
			if (marks[i] > highest) {
				highest = marks[i];
			}
			if (marks[i] > 80) {
				count2++;
			}
		}
		System.out.println("Total is " + total);
		System.out.println("Highest is " + highest);
		System.out.println(count2);
	}

}
