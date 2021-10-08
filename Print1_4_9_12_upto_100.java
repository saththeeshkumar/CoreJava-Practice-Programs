package simpleprograms;

public class Print1_4_9_12_upto_100 {

	public static void main(String[] args) {
		for(int i=1;i<=1000000;i++) {
			System.out.println(i*i);
			if(i*i==100) {
				break;
			}
		}

	}

}
