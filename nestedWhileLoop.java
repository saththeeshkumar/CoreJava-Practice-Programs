package simpleprograms;

public class nestedWhileLoop {

	public static void main(String[] args) {
		int no = 1;
		while (no <= 3) {
			int no1 = 1;
			while (no1 <= 5) {
				System.out.print(no1 + " ");
				no1++;
			}
			no++;
			System.out.println();
		}
		
		System.out.println();
		
		no = 1;
		while (no <= 3) {
			int no1 = 5;
			while (no1 >= 1) {
				System.out.print(no1 + " ");
				no1--;
			}
			no++;
			System.out.println();
		}

		
	
		
		
	}

}
