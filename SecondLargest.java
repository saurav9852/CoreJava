class SecondLargest
{
	public static void main (String args [])
	{
		int arr[] = {1, 2, 6, 11, 2, 3, 4, 10};
		int largest=arr[0];
		int second=arr[0];
		int i;
		for(i=1; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				second=largest;
				largest=arr[i];
			}
			else if(second<arr[i])
			{
				second=arr[i];
			}
		}
		System.out.println("Second Largest Number is: "+second);
	}
}