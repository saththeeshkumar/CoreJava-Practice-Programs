package simpleprograms;

public class ReverseNumber {
	public static void main(String[] args)   
	{  
	/*int number = 3004571, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  */
		
		int no = 2002;
		int no2=no;
		int rem = 0;
		while(no>0) {
			rem = (rem*10)+(no%10);
			no = no/10;
		}
		System.out.println(rem);
		if(rem==no2) {
			System.out.println("polindrome");
		}
	}  
}
