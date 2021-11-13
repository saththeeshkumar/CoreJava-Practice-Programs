package String;

import java.util.Scanner;

public class StringReverseSentence1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterthe input String: ");
		String s = sc.nextLine();
		String k = " ";
		s = s + k;

		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		char ch[] = s1.toCharArray();
		int space = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				char[] fin = reverse(s1, space, i - 1);
				s1 = new String(fin);
				space = i;
			}
		}

		ch = reverse(s1, space, s.length() - 1);
		s1 = new String(ch);
		System.out.println("Output string is: " + s1);
	}

	public static char[] reverse(String s1, int start, int end) {
		char ch[] = s1.toCharArray();
		char temp;

		while (start < end) {
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		return ch;
	}
}

/*
result:
Enterthe input String: 
sathish kumar kolanji
 ijnalok ramuk hsihtas
Output string is: kolanji kumar sathish 
*/