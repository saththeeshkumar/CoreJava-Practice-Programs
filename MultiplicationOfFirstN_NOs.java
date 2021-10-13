package simpleprograms;

public class MultiplicationOfFirstN_NOs {

	public static void main(String[] args) {
		MultiplicationOfFirstN_NOs obj = new MultiplicationOfFirstN_NOs();
		obj.Multiplication();
	     
	}
	//1*2*3*4*5
	void Multiplication() {
		  int no = 1;
		int total = 1;
	      while(no<=5) {
	    	   total = no * total;
	    	  no++;
	      }
       System.out.println(total);
	}


	}


