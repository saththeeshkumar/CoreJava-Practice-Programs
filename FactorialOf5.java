package simpleprograms;

public class FactorialOf5 {

	public static void main(String[] args) {
		FactorialOf5 obj = new FactorialOf5();
		obj.factorial();
	}

	void factorial() {
		int no = 5;
		int total = 1;
		while (no >= 1) {
			total = no * total;
			no--;
		}
		System.out.println(total);
	}

}
