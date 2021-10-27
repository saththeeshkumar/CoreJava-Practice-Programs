package simpleprograms;

public class Pattern3 {

	public static void main(String[] args) {
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row;col++) {
			System.out.print(col+" ");
		}
		System.out.print("*"+" ");
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row;col++) {
			System.out.print(col+" ");
		}
		for(int col=1;col<6;col++) {
		System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(col+" ");
		}
		for(int col=1;col<3;col++) {
		System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(col+" ");
		}
		for(int col=1;col<8-row;col++) {
		System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	//santhiya 2 inner loop change approach
	
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(col+" ");
		}
		for(int col1=6;col1>=row;col1--) {
		System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	//palani doubt
	
	for(int row = 6;row>1;row--) {
		/*for(int col=1;col<row-1;col++) {  // here,palani cmt this commented inner loop
			System.out.print(col+" ");
		}*/
		for(int col=1;col<8-row;col++) {
		System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(" "+" ");// from above(3) programe we have changed space instead of column
		}
		for(int col=1;col<8-row;col++) {
		System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<8-row;col++) {
		System.out.print(col+" " );
		}
		System.out.println();
	}
	
	System.out.println();
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<8-row;col++) {
		System.out.print(col+" "+" ");// here,if we give space anywhere,we will get same ans
		}                             // same space means(col+" "+" ") or (" "+col+" ")
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<8-row;col++) {
		System.out.print(row+" " );
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int row = 6;row>1;row--) {
		for(int col=1;col<row-1;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<8-row;col++) {
		System.out.print(" "+row+" "+" " );// here,if we give space anywhere,we will get same ans
		}                               // same space means(col+" "+" ") or (" "+col+" ")
		System.out.println();
	}
	}
}
