package simpleprograms;

public class FindingPrimeNoUpto_20 {

	public static void main(String[] args) {
		for(int i=2;i<=20;i++)
        {  
		  int count=0;
        	for(int j=2;j<=i;j++) {
        	  int k = i%j;
        	     if(k==0) {
        		 count=count+1;
          	 }
         
         }
			if(count==1) {
           	 System.out.println(i);
        	}
  	}
     


	}

}
