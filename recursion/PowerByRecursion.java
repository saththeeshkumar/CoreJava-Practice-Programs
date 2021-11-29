package recursion;

import java.util.Scanner;

public class PowerByRecursion {

	public static void main(String[] args) {
		PowerByRecursion obj = new PowerByRecursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int value = sc.nextInt();
		System.out.println("Enter Power Value");
		int power = sc.nextInt();
		int t = obj.powerRecursion(value,power);
        System.out.println("ANSWER IS: "+t);
	}

	private int powerRecursion(int value, int power) {
		if(value==0)
			return 0;
		if(power==0)
			return 1;
		else {
			int t = value * powerRecursion(value,power-1);
			return t;
		}
		
	}

}
/*
 * RESULT:
 * Enter Value
5
Enter Power Value
3
ANSWER IS: 125

*/
