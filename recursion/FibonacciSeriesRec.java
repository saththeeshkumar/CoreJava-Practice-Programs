package recursion;

import java.util.Scanner;

public class FibonacciSeriesRec {
	
	public static void main(String[] args) {
		FibonacciSeriesRec obj = new FibonacciSeriesRec();
		obj.fibomethodcalling();
	}

	private void fibomethodcalling() {
		FibonacciSeriesRec obj1 = new FibonacciSeriesRec();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int f = sc.nextInt();
		System.out.println("Enter The Second Number");
		int s = sc.nextInt();
		System.out.println("Enter Number upto you Need");
		int count = sc.nextInt();
		System.out.print(f+" "+s);
		obj1.Fibonacci(f,s,count);
		
	}

	private void Fibonacci(int f,int s,int count) {
		
    	   if(f+s<count) {
    		   System.out.print(" "+(f+s)+" ");
    		   Fibonacci(s,f+s,count);
    	   }
	}
}
/*
RESULT:
Enter The First Number
1
Enter The Second Number
2
Enter Number upto you Need
100
1 2 3  5  8  13  21  34  55  89 
*/