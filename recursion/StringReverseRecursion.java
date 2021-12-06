package recursion;

import java.util.Scanner;

public class StringReverseRecursion {

	public static void main(String[] args) {
		StringReverseRecursion obj = new StringReverseRecursion();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter values");
		String s =sc.nextLine();
		obj.stringReverse(s);

	}

	private String stringReverse(String s) {
		if(s.isEmpty())
			return s;
		else
			System.out.print(s.charAt(s.length()-1));
		return stringReverse(s.substring(0,s.length()-1));
	}

}
/*
RESULT:
Enter values
SATHISH KUMAR
RAMUK HSIHTAS
*/