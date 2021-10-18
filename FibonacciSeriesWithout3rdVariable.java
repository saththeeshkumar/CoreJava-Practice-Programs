package simpleprograms;

public class FibonacciSeriesWithout3rdVariable {

	public static void main(String[] args) {
		FibonacciSeriesWithout3rdVariable obj = new FibonacciSeriesWithout3rdVariable();
		obj.print();

	}
void print() {
	
	int f =-1;
	int s =1;
	int i = 1;
	//int ar[] = new int [11];
	while(i<=10) {
		System.out.print((f+s)+ " ");
//		ar[i] = f+s;
		s=f+s;
		f=s-f;
		i++;
		
	}
	
	/*for(int k =0;k<=ar.length-1;k++) {
	System.out.println("array values"+ar[k]);
	}*/
 
}
}
