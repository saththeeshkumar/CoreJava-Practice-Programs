package recursion;

import java.util.Scanner;

public class FindTriangle {

	public static void main(String[] args) {
		FindTriangle obj = new FindTriangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int n = sc.nextInt();
	    int t =	obj.findtriangle(n);
	    System.out.println("Triangle is: "+t);
	}

	private int findtriangle(int n) {
		if (n == 1)
			return 1;
		else {
			int t = n + findtriangle(n - 1);
			return t;
		}
	}
}

/*
RESULT:
Enter Value
5
Triangle is: 15
*/