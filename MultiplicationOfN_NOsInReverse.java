package simpleprograms;

public class MultiplicationOfN_NOsInReverse {

	public static void main(String[] args) {
		MultiplicationOfN_NOsInReverse obj = new MultiplicationOfN_NOsInReverse();
		obj.Multiplication();
	}
	void Multiplication() {
		  int no = 5;
		int total = 1;
	      while(no>=1) {
	    	   total = no * total;
	    	  no--;
	      }
     System.out.println(total);
	}

}
