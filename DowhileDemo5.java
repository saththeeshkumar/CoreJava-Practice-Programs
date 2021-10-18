package simpleprograms;
class DowhileDemo5
{
void demo()
{
int	no = 2;
	while(no<=20)
	{		
	if(no%2 ==0 || no%3 == 0) {
		System.out.println(no);
	
	}
no = no+1;
	}
}
public static void main(String[] args) {
	DowhileDemo5 obj = new DowhileDemo5();
obj.demo(); 
}}