package simpleprograms;

public class pattern2 {

	public static void main(String[] args) {
		int end =1;
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <= end; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
			end+=2;
		}
		
		System.out.println();


	}

}
