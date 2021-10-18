package simpleprograms;

public class FindANo {

	public static void main(String[] args) {
		String name = "sathi7h1";

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if (c >= '0' && c <= '9') {
				System.out.println(c);

			}
		}

	}

}
