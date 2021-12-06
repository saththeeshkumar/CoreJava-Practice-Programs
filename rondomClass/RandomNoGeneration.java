package rondomClass;

import java.util.Random;

public class RandomNoGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random random = new Random();
       for(int i =1;i<=5;i++) {
    	   System.out.println(random.nextInt(6)+1);
       }
	}

}
