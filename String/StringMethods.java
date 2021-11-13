package String;

public class StringMethods {

	public static void main(String[] args) {
		String name = "murali bose virudhunagar";
		
		// 1.letter count
		System.out.println(name.length());  // 24
		
		//3.  u  count
		// change to char array:
		
		char[] ch = name.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);  // murali bose virudhunagar
		}
		System.out.println();
	    char key = 'u';
	    int count=0;
	    for(int i =0;i<name.length();i++) {
	    	if(key==name.charAt(i)) {
	    		System.out.println(name.charAt(i));
	    		count ++;
	    	}
	    }
         System.out.println("Total: "+count);
         
      // find from above (3) u occured only one time
         
         char key1='u';
     	int total=0;
     	    for(int i =0;i<name.length();i++) {
     	    	if(key1==name.charAt(i)) {
     	    		total ++;
     	    		if(total>1) {
     	    			System.out.println("u occured more than one time");
     	    			break;
     	    		}
     	    	}
     	    }
     	    
     	    //find first and last index of 'u'

     	    System.out.println(name.indexOf('u'));
     	   System.out.println(name.lastIndexOf('u'));
     	   
     	   // reverse the String
     	   
     	   for(int i=name.length()-1;i>=0;i--) {
     		   System.out.print(name.charAt(i));
     	   }
     	   
     	   System.out.println();

     	   //confirm not polindrome
     	   
     	   String name1="tamil";
     	   
     	   int i =0,j=name1.length()-1;
     	   while(i<j) {
     		   if(name1.charAt(i)!=name1.charAt(j)) {
     			   System.out.println("Not Polindrome");
     			   break;
     		   }
     		   i++;j--;
     	   }
     	   
     	   //check polindrome
     	   
     	   String name2="malayalam";
          boolean polindrome = true;
          j=name2.length()-1;
    	   while(i<j) {
    		   if(name2.charAt(i)!=name2.charAt(j)) {
    			   System.out.println("Not Polindrome");
    			   polindrome=false;
    			   break;
    		   }
    		   i++;j--;
    	   }
    	   if(polindrome) {
    		   System.out.println("Given word is polindrome");
    	   }
     	}
	}
	
	/*
RESULT:
		
24
murali bose virudhunagar
u
u
u
Total: 3
u occured more than one time
1
18
raganuhduriv esob ilarum
Not Polindrome
Given word is polindrome

*/
		


