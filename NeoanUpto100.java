package simpleprograms;

public class NeoanUpto100 {

	public static void main(String[] args) {
		NeoanUpto100 obj = new NeoanUpto100();
		System.out.println("The below numbers are Neon Numbers:");
		obj.neonupto100();

	}

	void neonupto100() {
		for (int no = 0; no <= 100000; no++) {
			int no1 = no * no;
			int total = 0;
			for (; no1 > 0; no1 = no1 / 10) {
				total = total + no1 % 10;
			}
			if (total == no) {

				System.out.print(total + " ");
			}
		}
	}

}
