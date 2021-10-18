package simpleprograms;

public class Neon {

	public static void main(String[] args) {
		Neon obj = new Neon();
		obj.neon();
	}

	void neon() {
		int no = 9;
		int no1 = no*no;
		int total = 0;
		while (no1 > 0) {
			total = total + no1 % 10;
			no1=no1/10;
		}
		if (total == no) {
			System.out.println("The given No "+total+" is NEON no " );
		}
	}

}
