package simpleprograms;

public class Print_2_6_11_17_24___ {

	public static void main(String[] args) {
		Print_2_6_11_17_24___ obj = new Print_2_6_11_17_24___();
		obj.printabove();
	}

	void printabove() {
		int i = 2;
		int j = 4;
		System.out.println(i);
		while (true) {
			int k = i + j;
			System.out.println(k);
			i = k;
			j++;
			if (i >= 24) { //  ------> choice
				break;
			} 
		}
	}

}
