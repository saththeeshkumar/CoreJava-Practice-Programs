package simpleprograms;

public class Armstrong {

	public static void main(String[] args) {
		
		Armstrong obj = new Armstrong();
		obj.armstrong();
	}

	void armstrong() {
		for (int no = 1; no <= 1000; no++) {
			int no1 = no;
			int no2 = no1;
			int digit = 0;
			int total = 0;
			while (no1 > 0) {
				no1 = no1 / 10;
				digit++;
			}
			while (no > 0) {
				total = total + (int) Math.pow(no % 10, digit);
				no = no / 10;
			}
			no = no2;
			if (no2 == total) {
				System.out.println(no2);
			}

		}
	}
}
