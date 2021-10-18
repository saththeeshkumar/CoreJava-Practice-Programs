package simpleprograms;

public class FindingPrimeNo {

	public static void main(String[] args) {
          int i=15;
          int j = 2;
     boolean prime = true;
       //   int count=0;
         while(j<i) {
        	  int k=i%j;
        	  if(k==0) {
         		// System.out.println(i + " is not prime no");
        		  prime = false;
         		  break;
         	  }
         	 /* else{
         		  System.out.println(i + " is  prime no");
         		  break;
         	  }*/
        	 /*  if(k==0) {
        		   count=count+1;
        	   }
        	   j++;
          }
          if(count==1) {
        	  System.out.println(i + " is Prime No");
          }
          else
          {
        	  System.out.println(i+" is Not Prime");
          }*/
        j++;
	}	
         if(prime==true) {
        	 System.out.println(i+" prime no");
         }
         else {
        	 System.out.println(i+" not a prime no");
         }
		
}}

