package simpleprograms;

public class Primeno_sPresentAmongFiboSeries {

	public static void main(String[] args) {
		Primeno_sPresentAmongFiboSeries obj = new Primeno_sPresentAmongFiboSeries();
		obj.print();

	}

	void print() {
		int f = -1;
		int s = 1;
		int i = 1;
		while (i <= 10) {
			// System.out.print((f + s) + " ");
			int prime_or_not = f + s;
			checkprime(prime_or_not);
			if (checkprime(prime_or_not) == true) {
				System.out.println(prime_or_not + " is prime number");
			} else {
				System.out.println(prime_or_not + " is not prime number");
			}
			s = f + s;
			f = s - f;
			i++;
		}
	}

	private boolean checkprime(int prime_or_not) {
		boolean prime = true;
		for (int j = 2; j < prime_or_not; j++) {
			if (prime_or_not % j == 0) {
				prime = false;
				break;
			}
		}
		if (prime==true) {
			return true;
		} else {
			return false;
		}
	}
}
