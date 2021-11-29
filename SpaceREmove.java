package simpleprograms;

public class SpaceREmove {

	public static void main(String[] args) {
		String s = "  sathish   kumar   K   ";
		String sk = "";
		s = s.trim();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				sk = sk + s.charAt(i);
			} else if (s.charAt(i) == ' ') {
				sk = sk + s.charAt(i);
				int j = 0;
				while (s.charAt(i) == ' ') {
					j = i;
					i++;
				}
				i = j;
			}

		}
		System.out.println(sk);
	}
}
