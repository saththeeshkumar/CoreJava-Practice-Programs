package simpleprograms;

public class Pattren1 {

	public static void main(String[] args) {

	for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		

		for (int row = 5; row >= 1; row--) {
			for (int col = 5; col >= row; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
int no = 1;
		for (int row = 1; row <= 4; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print(no+ " ");
				no++;
			}
			System.out.println();
		}	

		System.out.println();
		
for (int row = 1; row <= 5; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print(row*col+ " ");
				no++;
			}
			System.out.println();
		}	
		
		
		
	}

}
