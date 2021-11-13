package String;

import java.util.Scanner;

public class FindRepeatedCharAndUniq {
	
	public static void main(String[] args) {
		FindRepeatedCharAndUniq obj = new FindRepeatedCharAndUniq();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.nextLine();
		System.out.println();
		obj.FindCharOccuredNo(name);
	    obj.uniqChar(name);;
	    obj.maxOccuredChar(name);
	    obj.SecMax(name);
		
	}


	private void SecMax(String name) {
		// TODO Auto-generated method stub
		int[] frequency = new int[name.length()];
		for (int j = 0; j < name.length(); j++) {
			int count = 0;
			char ch = name.charAt(j);
			for (int i = 0; i < name.length(); i++) {
				if (ch == name.charAt(i)) {
                   count++;
				}
			} 
		    frequency[j] = 	count; for(int i = j+1;i<name.length();i++) {
		    	if(name.charAt(j)==name.charAt(i)) {
		    		frequency[j] = -1;
		    	}	
		    }
		}
		
		char[] arr = name.toCharArray();
		int temp;
		char temp1;
		
		for(int i =0;i<frequency.length;i++) {
			for(int j =i+1;j<frequency.length;j++) {
			if(frequency[i]>frequency[j]) {
				temp=frequency[i];
				temp1=arr[i];
				frequency[i]=frequency[j];
				arr[i]=arr[j];
				frequency[j]=temp;
				arr[j]=temp1;
			}
			}
		}
		System.out.print("The Second Maximum is ");
		System.out.print(arr[arr.length-2]+" ");
		System.out.println(frequency[frequency.length-2]);
		
		
	}


	private void maxOccuredChar(String name) {
		// TODO Auto-generated method stub
		int[] frequency = new int[name.length()];
		for (int j = 0; j < name.length(); j++) {
			int count = 0;
			char ch = name.charAt(j);
			for (int i = 0; i < name.length(); i++) {
				if (ch == name.charAt(i)) {
                   count++;
				}
			} 
		    frequency[j] = 	count;
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0;i<frequency.length;i++) {
	    	if(frequency[i]>=max) {
	    		max = frequency[i];
	    		index = i;
	    	}	
	    }
        	System.out.println(name.charAt(index)+" ocuures " + max + " times");
	        System.out.println();
	}
		

	private void uniqChar(String name) {
		// TODO Auto-generated method stub
		int[] frequency = new int[name.length()];
		for (int j = 0; j < name.length(); j++) {
			int count = 0;
			char ch = name.charAt(j);
			for (int i = 0; i < name.length(); i++) {
				if (ch == name.charAt(i)) {
                   count++;
				}
			} 
			//System.out.println(name.charAt(j)+ " appears "+ count + " time ");
		//	letters[j] = name.charAt(j);
		    frequency[j] = 	count;
		    for(int i = j+1;i<name.length();i++) {
		    	if(name.charAt(j)==name.charAt(i)) {
		    		frequency[j] = -1;
		    	}	
		    }
		}
		for(int i =0;i<name.length();i++) {
			if(frequency[i]>0) {
			if(frequency[i]>1 && name.charAt(i)!=' ')
			System.out.println(name.charAt(i)+" appears "+ frequency[i]+ " times ");
			}
		}
            System.out.println();
		
	}

	
	private void FindCharOccuredNo(String name) {
		// TODO Auto-generated method stub
		int[] frequency = new int[name.length()];
		for (int j = 0; j < name.length(); j++) {
			int count = 0;
			char ch = name.charAt(j);
			for (int i = 0; i < name.length(); i++) {
				if (ch == name.charAt(i)) {
                   count++;
				}
			} 
			//System.out.println(name.charAt(j)+ " appears "+ count + " time ");
		//	letters[j] = name.charAt(j);
		    frequency[j] = 	count;
		    for(int i = j+1;i<name.length();i++) {
		    	if(name.charAt(j)==name.charAt(i)) {
		    		frequency[j] = -1;
		    	}	
		    }
		}
		for(int i =0;i<name.length();i++) {
			if(frequency[i]>0) {
		//		if(frequency[i]>1 && name.charAt(i)!=' ')
			System.out.println(name.charAt(i)+" appears "+ frequency[i]+ " times ");
			}
		}
            System.out.println();
		
	}

}

/*
RESULT:

Enter the String
RAJAN BABU

R appears 1 times 
J appears 1 times 
N appears 1 times 
  appears 1 times 
A appears 3 times 
B appears 2 times 
U appears 1 times 

A appears 3 times 
B appears 2 times 

A ocuures 3 times

The Second Maximum is B 2
*/