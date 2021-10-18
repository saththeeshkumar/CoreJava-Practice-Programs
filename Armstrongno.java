package simpleprograms;

public class Armstrongno {

	public static void main(String[] args) {
		Armstrongno obj = new Armstrongno();
		obj.printArmstrongno();

	}

	void printArmstrongno() {
		int no = 1;
		int no1 = no;
		int no2 = no;
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
		if (no2 == total) {
			System.out.println("The given Number " + no2 + " is Armstrong number ");
		} else {
			System.out.println("The given Number " + no2 + " is Not Armstrong number ");
		}
	}

}
