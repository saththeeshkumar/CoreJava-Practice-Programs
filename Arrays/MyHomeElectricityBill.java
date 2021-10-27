package Array;

import java.util.Scanner;

public class MyHomeElectricityBill {

	public static void main(String[] args) {
		MyHomeElectricityBill obj = new MyHomeElectricityBill();
		obj.myHomeElectricityBill();
	}

	private void myHomeElectricityBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.of months Reading Taken: ");
		int count = sc.nextInt();
		int[] amount = new int[count];
		int total = 0;
		float average = 0;
		int highest = 0;
		int lowest = 0;
		for (int i = 0; i < amount.length; i++) {
			System.out.println("Enter the Amount: ");
			amount[i] = sc.nextInt();
			total = total + amount[i];
			average = total / count + (total % count);
			if (amount[i] > highest) {
				highest = amount[i];
			}
			if (i == 0) {
				lowest = amount[0];
			} else {
				if (amount[i] < lowest) {
					lowest = amount[i];
				}
			}
		}
		System.out.println("Total amount paid: " + total);
		System.out.println("Average of the Total: " + average);
		System.out.println("Highest Amount paid: " + highest);
		System.out.println("Lowest amount paid: " + lowest);

	}

}
