package simpleprograms;

public class Print_13_25_51_101_203___ {

	public static void main(String[] args) {
		Print_13_25_51_101_203___ obj = new Print_13_25_51_101_203___();
		obj.printabove();
	}

	void printabove() {
		int i = 13;
		System.out.print(i + " ");
		while (true) {
			int j = (i * 2) - 1;
			System.out.print(j + " ");
			int k = (j * 2) + 1;
			System.out.print(k + " ");
			i = k;
			if (i == 203) {    // ------> choice
				break;
			} 
		}

	}

}
