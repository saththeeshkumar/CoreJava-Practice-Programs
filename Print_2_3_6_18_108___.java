package simpleprograms;

public class Print_2_3_6_18_108___ {

	public static void main(String[] args) {
		Print_2_3_6_18_108___ obj = new Print_2_3_6_18_108___();
		obj.printabove();
	}

	void printabove() {
		int i = 2;
		int j = 3;
		System.out.print(i + " " + j + " ");
		while (true) {
			int k = i * j;
			System.out.print(k + " ");
			i = j;
			j = k;
			if (j == 108) {    // -----> choice
				break;
			} 
		}

	}

}
