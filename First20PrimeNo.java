package simpleprograms;

public class First20PrimeNo {

	public static void main(String[] args) {
		First20PrimeNo obj = new First20PrimeNo();
		obj.first20primeno();
	}

	void first20primeno() {
		int i = 1;
		int count = 1;
		while (count <= 20) {
			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println(i + " is a prime number");
				count++;
			}
			i++;
		}
	}
}
