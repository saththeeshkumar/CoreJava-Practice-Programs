package simpleprograms;

public class Print_2_6_12_20_30 {

	public static void main(String[] args) {
		Print_2_6_12_20_30 obj = new Print_2_6_12_20_30();
		obj.printabove();

	}

	private void printabove() {
		int i = 1;
		while(i<=5) {
			System.out.print(i*(i+1)+ " ");
			i++;
		}
		
	}

}
