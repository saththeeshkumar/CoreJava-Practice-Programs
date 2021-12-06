package recursion;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FindFactorial obj = new FindFactorial();
		System.out.println("Give A Number to Find Factorial");
		int result = obj.findfactorial(sc.nextInt());
		System.out.println("Factorial of Given Number is: "+result);
	}

	private int findfactorial(int facNo) {
		if (facNo == 1)
			return 1;
		else {
			return facNo * findfactorial(facNo - 1);
		}

	}
}

/*
RESULT:
Give A Number to Find Factorial
5
Factorial of Given Number is: 120
*/