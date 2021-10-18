package simpleprograms;

public class StrongNoUpto {

	public static void main(String[] args) {
		StrongNoUpto obj = new StrongNoUpto();
		System.out.println("The below numbers are Strong No upto Given Number");
		obj.strongnoupto();
	}

	void strongnoupto() {
		for (int no = 1; no <= 1000; no++) {
			int no1 = no;
			int no2 = no;
			int total = 0;
			while (no1 > 0) {
				no1 = no1 % 10;
				int no3 = no1;
				while (no3 > 1) {
					no1 = (no1 * (no3 - 1));
					no3--;
				}
				total = total + no1;
				no = no / 10;
				no1 = no;
			}
			if (total == no2) {
				System.out.print(total + " ");
			}
			no = no2;
		}
	}

}
