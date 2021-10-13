package simpleprograms;

public class Print_165_195_255_285_345___ {

	public static void main(String[] args) {
		Print_165_195_255_285_345___ obj = new Print_165_195_255_285_345___();
		obj.printabove();
	}

	void printabove() {
		int i = 165;
		System.out.print(i + " ");
		while (true) {
			int j = i + 30;
			System.out.print(j + " ");
			int k = j + 60;
			System.out.print(k + " ");
			i = k;
			if (i == 345) {     // ----> choice
				break;
			} 
		}
	}
}
