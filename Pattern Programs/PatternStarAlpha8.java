package simpleprograms;

public class PatternStarAlpha8 {

	public static void main(String[] args) {
		for (int row = 1; row <= 7; row++) {
			if (row == 1 || row == 7) {
				for (int col = 1; col <= 6; col++) {
					System.out.print("* ");
				}
			} else {
				for (int col = 1; col <= 6; col++) {
					if (col == 1 || col == 6) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

		for (int row = 1; row <= 6; row++) {
			if (row == 6) {
				for (int col = 1; col <= 6; col++) {
					System.out.print("* ");
				}
			} else {
				for (int col = 1; col <= 6; col++) {
					if (col == 1 || col == 6) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();

		}
	}

}
