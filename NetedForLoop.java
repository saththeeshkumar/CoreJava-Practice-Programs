package simpleprograms;

public class NetedForLoop {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 6; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= 4; row++) {
			for (int col = 0; col <= 6; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= 4; row++) {
			for (int col = 3; col <= 8; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
