package simpleprograms;

public class FindingPrimeNoUpto_20 {

	public static void main(String[] args) {

		FindingPrimeNoUpto_20 pn = new FindingPrimeNoUpto_20();
		pn.findPrimeNo();
	}

	void findPrimeNo() {

		for (int i = 2; i <= 20; i++) {
			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println(i + " is a prime number");
			}
		}
	}
}
