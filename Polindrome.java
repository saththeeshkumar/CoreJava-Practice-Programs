package simpleprograms;

public class Polindrome {

	public static void main(String[] args) {
		Polindrome obj = new Polindrome();
		obj.checkPolindrome();

	}
void checkPolindrome() {
	int no = 2002;
	int no2=no;
	int rem = 0;
	while(no>0) {
		rem = (rem*10)+(no%10);
		no = no/10;
	}
	System.out.println(rem);
	if(rem==no2) {
		System.out.println("Above No is polindrome");
	}
}  

}

