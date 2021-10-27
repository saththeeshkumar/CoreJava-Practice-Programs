package simpleprograms;

public class patternDay2Home {
	
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=4;col>=row;col--) {
				System.out.print(" "+" ");
			}
			for(int col1=5;col1>=6-row;col1--) {
				System.out.print(col1+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int no = 5;
		for(int row=0;row<=4;row++) {
			
			for(int col=4;col>=row+1;col--) {
				System.out.print(" "+" ");
			}
			
			int allowno=no;
			for(int col1=5;col1>=5-row;col1--) {
				System.out.print(allowno+" ");	
				allowno++;
			}
			
			System.out.println();	
			no--;
		}
		
		System.out.println();
		
		 for(int row=5;row>=1;row--) { 
		      for(int k=1;k<row;k++) {
		        System.out.print(" "+" ");
		      }
		      
		      for(int col=row;col<=5;col++) { 
		        System.out.print(col+" ");
		      }
		      
		      System.out.println();
		    }
		 
		 System.out.println();
		 
		int row=5;
		 for(;row>=1;row--) {
			 for(int col = row;col>=1;col--) {
				 System.out.print(col+" ");
			 }
			 if(row>1) {
			 System.out.println();
		      }
		 }
		 for(;row<=5;row++) {
			 for(int col = row;col>=1;col--) {
				 System.out.print(col+" ");
			 }
			 System.out.println();
		 }
		 
		 
	}
}
