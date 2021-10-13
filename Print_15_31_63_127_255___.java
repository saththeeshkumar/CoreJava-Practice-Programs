package simpleprograms;

public class Print_15_31_63_127_255___ {

	public static void main(String[] args) {
		Print_15_31_63_127_255___ obj = new Print_15_31_63_127_255___();
		obj.printabove();
	}

	void printabove() {
		int i = 15;
		System.out.print(i + " ");
		while (true) {
			int k = (i * 2) + 1;
			System.out.print(k + " ");
			i = k;
			if (i == 255) {    // -----> choice
				break;
			} 
		}
	}
}
