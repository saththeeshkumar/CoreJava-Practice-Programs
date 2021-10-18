package simpleprograms;

public class Print_1_0_0_2_3_7_3_8_21__ {

	public static void main(String[] args) {
		Print_1_0_0_2_3_7_3_8_21__ obj = new Print_1_0_0_2_3_7_3_8_21__();
		obj.printabove();

	}

	void printabove() {
		int i = 1;
		int j = 1;
		while (true) {
			int k = (int) Math.pow(i, j);
			System.out.print(k + " ");
			j++;
			while (j <= 3) {
				int k1 = (int) Math.pow(i, j) - 1;
				System.out.print(k1 + " ");
				j++;
			}
			i++;
			j = 1;
			if (i == 4) {   // ----->  choice
				break;
			}

		}

	}

}
