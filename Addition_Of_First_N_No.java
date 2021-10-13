package simpleprograms;

public class Addition_Of_First_N_No {

	public static void main(String[] args) {
		Addition_Of_First_N_No obj = new Addition_Of_First_N_No();
		obj.addtion();
	     
	}
	void addtion() {
		 int total = 0;
	      int no = 1;
	      while(no<=20) {
	    	  total = total + no;
	    	  no++;
	      }
       System.out.println(total);
	}

}
