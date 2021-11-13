package Array;

import java.util.Scanner;

public class Spiral_Matrix {
  public static void main(String args[])
    {
        System.out.println("Enter The Value For Row and column :");
         
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
         
        int[][] spiral = new int[n][n];
         
        int value = 1;
         
        int minCol = 0;
         
        int maxCol = n-1;
         
        int minRow = 0;
         
        int maxRow = n-1;
         
        System.out.println("Enter the values ");
        while (value <= n*n)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                spiral[minRow][i] = sc.nextInt();
                value++;
            }
             
            for (int i = minRow+1; i <= maxRow; i++) 
            { 
                spiral[i][maxCol] = sc.nextInt(); 
                value++; 
            } 
             
            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = sc.nextInt();
                value++;
            }
             
            for (int i = maxRow-1; i >= minRow+1; i--) 
            {
                spiral[i][minCol] = sc.nextInt(); 
                value++;
            }
             
            minCol++;
             
            minRow++;
             
            maxCol--;
             
            maxRow--;
        }
        System.out.println("Spiral form of given 2D array"); 
        
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }
             
            System.out.println();
        }
    }
}

/*result:
	Enter The Value For Row and column :
    3
    Enter the values 
    1
    2
    3
    4
    5
    6
    7
    8
    9
    Spiral form of given 2D array
    1	2	3	
    8	9	4	
    7	6	5		*/
