package simpleprograms;

public class PrintingOnlyMultiplesOf_3_And_5 {

	public static void main(String[] args) {
	  int i=1;
	  while(i<=12) {
         if((i%3==0)||(i%2==0)) {
        	 System.out.println(i);
         }
         i++;
	  }

	}

}
