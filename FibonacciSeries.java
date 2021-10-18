package simpleprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		//1st 10 no.of fibonacci series
		int f = 0;int s = 1; int i=1;
		int t = 0;
		while(i<=10) {
			t=f+s;
			System.out.println(t + " ");
			f=s;
			s=t;
		}

	}

}
