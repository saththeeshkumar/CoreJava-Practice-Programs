package Array;

public class SortingArray {
	int[] arr = { 10, 60, 75, 21, 98, 45, 61, 54, 6, 78, 21 };

	public static void main(String[] args) {
		SortingArray obj = new SortingArray();
		obj.accending();
		System.out.println();
		obj.decending();

	}

	private void decending() {
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}

	}

	private void accending() {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}
}
