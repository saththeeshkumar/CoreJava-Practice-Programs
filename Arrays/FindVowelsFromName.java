package Array;

import java.util.Scanner;

public class FindVowelsFromName {

	public static void main(String[] args) {
		FindVowelsFromName obj=new FindVowelsFromName();
		obj.findVowelsFromName();
	}

	private void findVowelsFromName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
	    String name=sc.nextLine();   
	      int VowelsCount = 0; 
	      name = name.toLowerCase();    
	       for(int i = 0; i < name.length(); i++) {     
	    if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {    
	    	VowelsCount++;    
	                } 
	            }    
	            System.out.println("Number of vowels: " + VowelsCount);  
	}

}
