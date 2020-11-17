// Java program to print all elements that
// appear more than once. 
// for i =0 to A.length ==> A[i] must be <= A.length
import java.util.*;
class arrayRepeating {

	// function to find repeating elements
	static void printRepeating(int arr[], int n)
	{
		// First check all the values that are
		// present in an array then go to that
		// values as indexes and increment by
		// the size of array
		for (int i = 0; i < n; i++) 
		{
			int index = arr[i] % n;
			arr[index] += n;
			//System.out.println("For i="+i+" Index is "+index+" and Value is "+arr[index]);
		}
		
		System.out.println("Array is"+Arrays.toString(arr));
		// Now check which value exists more
		// than once by dividing with the size
		// of array
		for (int i = 0; i < n; i++) 
		{
			//System.out.println("Val divided "+(arr[i] / n));
			if ((arr[i] / n) >= 2)
				System.out.println(i + " ");
		}
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 10,10,6,3,1,3,6,5,7,4,2};
		int arr_size = arr.length;

		System.out.println("The repeating elements are: ");

		// Function call
		printRepeating(arr, arr_size);
	}
}
