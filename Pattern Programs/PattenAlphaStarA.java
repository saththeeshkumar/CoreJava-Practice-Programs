package simpleprograms;

public class PattenAlphaStarA {

	public static void main(String[] args) {
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

}
