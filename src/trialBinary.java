
public class trialBinary {
	int binarySearch(int arr[], int low, int high, int num) {
		if (high>= low) {
			int mid = (high+low)/2;
			
			if (arr[mid] == num) return mid;
			
			if (arr[mid] > num) return binarySearch(arr, low, mid-1, num);
			
			return binarySearch(arr, mid+1, high, num);
			
		}
		return -1;
	}
}
