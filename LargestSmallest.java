class LargestSmallest
{
	public static void main (String args [])
	{
		int arr[] = {23, 34, 77, 11, 99, 101, 22, 9, 1};
		int max=arr[0];
		int min=arr[0];
		int n = arr.length;
		for(int i=1; i<n; i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Largest Element is: "+max);
		System.out.println("Smallest Element is: "+min);	
	}
}