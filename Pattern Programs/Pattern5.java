package simpleprograms;

public class Pattern5 {

	public static void main(String[] args) {
		int value =1;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		
		System.out.println();

		int value1 =1;
		for(int row=1;row<=5;row++) {
			for(int col=row;col<=value1;col+=5) {
				System.out.print(col+" ");
			}
			System.out.println();
			value1+=6;
		}
	}

}
