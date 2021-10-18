package simpleprograms;

public class print_11_13_17_19_23___ {

	public static void main(String[] args) {
		print_11_13_17_19_23___ obj = new print_11_13_17_19_23___();
		obj.printabove();
	}

	/*void printabove() {
		for (int i = 11; i == i; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				int k = i % j;
				if (k == 0) {
					count = count + 1;
				}
			}
			if (count == 1) {
				System.out.print(i + " ");    //  11 13 17 191 23
			}
			if (i == 23) {           // -----> choice
				break;
			} 
		}
	}*/
	void printabove() {
		int i =11;
		while(i<=23) {
			System.out.println(i);
			if(i==23) {break;}
			i=i+2;
			System.out.println(i);
			i=i+4;
		}
	}
}