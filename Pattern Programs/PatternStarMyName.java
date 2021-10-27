package simpleprograms;

public class PatternStarMyName {

	public static void main(String[] args) {
		PatternStarMyName name = new PatternStarMyName();
		name.s();
		System.out.println();
		System.out.println();
		name.a();
		System.out.println();
		System.out.println();
		name.t();
		System.out.println();
		System.out.println();
		name.h();
		System.out.println();
		System.out.println();
		name.i();
		System.out.println();
		System.out.println();
		name.s();
		System.out.println();
		System.out.println();
		name.h();
		

	}

	private void i() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==4) {
			System.out.println("*");
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void h() {
		for (int row = 1; row <= 7; row++) {
			if (row == 7) {
				for (int col = 1; col <= 6; col++) {
					System.out.print("* ");
				}
			} else {
				for (int col = 1; col <= 6; col++) {
					if (col == 1 || col == 6) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

		for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= 6; col++) {
					if (col == 1 || col == 6) {
						System.out.print("* ");
					} 
					else{
						System.out.print("  ");
					}		
				}
				System.out.println();
			}
			}

	private void t() {
		for(int row=1;row<=5;row++) {
			if(row==1) {
			for(int col=1;col<=5;col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
				for(int col=1;col<=5;col++) {
					if(col==3) {
					System.out.print("* ");
				}
					System.out.print("  ");
				}
				System.out.println();
				
			}
		}
		
		
	

	private void a() {
		// TODO Auto-generated method stub
		for(int row=6;row>=1;row--) {
	    	   if(row==6) {
	    		   for(int col2=8;col2>=1;col2--) {
	    			   if(col2==1) {
	    				   System.out.println("*");
	    			   }
	    			   System.out.print(" ");
	    		   }
	    		   System.out.println();
	    	   }
	    	   else {
	    	   for(int col=row;col>=1;col--) {
	    		   System.out.print(" ");
	    	   }
	    	   System.out.print("* ");
	    	   for(int col1=row;col1<=5;col1++) {
				   System.out.print("  ");
			   }
	    	   System.out.println("* ");
	    	   System.out.println();
	    	   }
	       }
		
	}

	private void s() {
		for (int row = 1; row <= 7; row++) {
			if (row == 1 || row == 7) {
				for (int col = 1; col <= 6; col++) {
					System.out.print("* ");
				}
			} else {
				for (int col = 1; col <= 6; col++) {
					if (col == 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

		for (int row = 1; row <= 6; row++) {
			if (row == 6) {
				for (int col = 1; col <= 6; col++) {
					System.out.print("* ");
				}
			} else {
				for (int col = 1; col <= 6; col++) {
					if (col == 6) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();

		}
		
	}

}
