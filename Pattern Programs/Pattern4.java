package simpleprograms;

public class Pattern4 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.print("* ");
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		System.out.print("* "+"* ");
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++) {
			System.out.print(col+" ");
		}
		for(int col=1;col<=6-row;col++) {
		System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<row;col++) {// above program col<=row  o/p of 1st line:1 * * * * *
			System.out.print(col+" ");// here col<row o/p of 1st line; * * * * * 
		}
		for(int col=1;col<=6-row;col++) {
		System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<row;col++) {
			System.out.print(" "+" ");//here we put space instead of col
		}
		for(int col=1;col<=6-row;col++) {
		System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<row;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<=6-row;col++) {
		System.out.print("* "+" "+" ");//here add two spaces
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<row;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<=6-row;col++) {
		System.out.print(row +" "+" ");//here add two spaces
		}
		System.out.println();
		}
		
		System.out.println();
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<row;col++) {
			System.out.print(" "+" ");
		}
		for(int col=1;col<=6-row;col++) {
		System.out.print(col +" "+" "+" ");//here add two spaces
		}
		System.out.println();
		}
	}
}
