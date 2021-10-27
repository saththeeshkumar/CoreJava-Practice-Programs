package Array;

public class Two_D_Array_Multiplication {
	
	/*public static void main(String[] args) {
		
	int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
	int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
	    
	//creating another matrix to store the multiplication of two matrices    
	int c[][]=new int[3][3];  //3 rows and 3 columns  
	    
	//multiplying and printing multiplication of 2 matrices    
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	c[i][j]=0;      
	for(int k=0;k<3;k++)      
	{      
	c[i][j]+=a[i][k]*b[k][j];      
	}//end of k loop  
	System.out.print(c[i][j]+" ");  //printing matrix element  
	}//end of j loop  
	System.out.println();//new line    
	}    
	}} */

	int[][] a= {{3,4},{2,1}};
	int[][] b= {{1,5},{3,7}};
	
	public static void main(String[] args) {
		Two_D_Array_Multiplication obj = new Two_D_Array_Multiplication();
		obj.multiplicat();

	}

	private void multiplicat() {
		int[][] c=new int[2][2];
		for(int i =0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=0;
				for(int k=1;k<2;k++) {
					c[i][j]+=a[i][k]*b[k][j]; 
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
