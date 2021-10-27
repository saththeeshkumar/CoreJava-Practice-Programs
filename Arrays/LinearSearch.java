package Array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] ar = {10,20,5,8,25};
		int key = 5;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				System.out.println("Found No");
				break;
			}
		}
	}
}
