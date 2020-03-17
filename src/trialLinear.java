public class trialLinear {
	public static int search(int arr[], int wantedNum) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == wantedNum) return i;
		
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 10, 40};
		int wantedNum = 17;
		
		int result = search(arr, wantedNum);
		if (result == -1) System.out.println("Element not found");
		else System.out.println("Element is present at index" + result);
	}
}
