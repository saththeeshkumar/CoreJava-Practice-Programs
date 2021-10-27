package simpleprograms;

public class PatternStarAlpha {

	public static void main(String[] args) {
		for(int row=1;row<=7;row++) {
			if(row==1) {
				for(int col=1;col<=5;col++) {
				System.out.print("* ");
				}
			}
			if(row==4) {
				for(int col=1;col<=3;col++) {
					System.out.print("* ");
				}
			}
			System.out.println("* ");
		}

		System.out.println();
		
	}

}
