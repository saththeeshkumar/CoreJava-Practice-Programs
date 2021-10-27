package simpleprograms;

public class PatternStarAlphaD {

	public static void main(String[] args) {
		for (int row = 1; row <= 7; row++) {
			if (row == 7 || row == 1) {
				for (int col = 1; col <= 5; col++) {
					if (col == 5) {
						System.out.print("  ");
						System.out.println();
					} else {
						System.out.print("* ");
					}

				}

			} else {
				for (int col = 1; col <= 5; col++) {
					if (col == 1 || col == 5) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}

		}

	}

}
