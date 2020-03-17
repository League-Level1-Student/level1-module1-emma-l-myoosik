
public class trailRunner {
	public static void main(String[] args) {
		trialBinary ob = new trialBinary();
		int arr[] = {2, 3, 4, 10, 70};
		int size = arr.length;
		int num = 4;
		
		int result = ob.binarySearch(arr, 0, size-1, num);
		if (result == -1) System.out.println("Element not present");
		else System.out.println("Element found at index " + result);
	}
}
