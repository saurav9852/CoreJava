import java.util.*;

class CompareArray
{
	public static void main(String args [])
	{
		int arr[] = {8, 9, 1, 3, 4, 5, 11};
		int arr2[] = {3, 4, 5};
		System.out.println(Arrays.equals(arr, arr2));
		int arr3[] = {3, 4, 5};
		System.out.println(Arrays.equals(arr2, arr3));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}