package simpleprograms;

public class StrongNo {

	public static void main(String[] args) {
		StrongNo obj = new StrongNo();
		obj.strongno();
	}

	void strongno() {
		int no = 145;
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
			System.out.print("The given Number " + total + " is Strong Number");
		}
	}

}
