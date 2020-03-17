
public class testRun {
	public static void main(String args[])  { 
        otherTestClass ob = new otherTestClass(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int size = arr.length; 
        int key = 23; 
        int result = ob.binarySearch(arr, 0, size - 1, key); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    }
}
