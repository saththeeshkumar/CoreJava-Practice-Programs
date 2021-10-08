package simpleprograms;

public class FindingPrimeNo {

	public static void main(String[] args) {
          int i=19;
          int count=0;
          for(int j=1;j<=i;j++) {
        	  int k=i%j;
        	   if(k==0) {
        		   count=count+1;
        	   }
          }
          if(count==2) {
        	  System.out.println(i);
          }
        
	}
		
		
		
		
}

