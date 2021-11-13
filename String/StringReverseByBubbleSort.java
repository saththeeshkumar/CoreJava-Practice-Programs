package String;

public class StringReverseByBubbleSort {

	public static void main(String[] args) {
		StringReverseByBubbleSort obj = new StringReverseByBubbleSort();
		obj.reversebyswapping();

	}

	private void reversebyswapping() {
		String name = "sathish kumar";
		int i =0;int j =name.length()-1;
		char[] a = name.toCharArray();
		while(i<j) {
			char temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}

/*
RESULT:

h s i h t a s 
*/