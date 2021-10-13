package simpleprograms;

public class FactorialOfN_NOs {

	public static void main(String[] args) {
		FactorialOfN_NOs obj = new FactorialOfN_NOs();
		obj.factorial();
	}
	  private void factorial() {
		  int count = 5;
		  while(count>=1) {
			int factorial = 1;
			int no =1;
		      while(no<=count) {
		    	  factorial = no * factorial;
		    	  no++;
		      }
	   System.out.println(factorial);
	   count--;
		}
	  }
	}
	

