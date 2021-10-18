package simpleprograms;

public class Print_3_7_16_35___ {

	public static void main(String[] args) {
		Print_3_7_16_35___ obj = new Print_3_7_16_35___();
		obj.printabove();

	}

	void printabove() {
		int i = 3;
		int j = 1;
		System.out.print(i + " ");
		while (true) {
			int k = (i * 2) + j;
			System.out.print(k + " ");
			if (k >= 35) {   //   ----->  choice
				break;
			}
			i = k;
			j++;
		

		}

	}

}
