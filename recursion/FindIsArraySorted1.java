package recursion;

public class FindIsArraySorted1 {

	public static void main(String[] args) {
		FindIsArraySorted1 obj = new FindIsArraySorted1();
		int[] arr = {23,48,64,78,95};
		int length = arr.length;
		obj.isArraySorted(arr,length);
		if(isArraySorted(arr,length)!=0)
			System.out.println("Sorted Array");
		else
			System.out.println("Not a Sorted Array");

	}

	private static int isArraySorted(int[] arr,int length) {
		if(length==1 || length == 0)
			return 1;
		if(arr[length-1]<arr[length-2])
			return 0;
		return isArraySorted(arr,length-1);
		
	}

}
/*
Result:
for int[] arr = {23,48,64,78,95};      Sorted Array
for int[] arr = {23,48,64,95,78};      Not a Sorted Array
*/