class MissingElement
{
	public static void main (String args [])
	{
		int arr[] = {1, 2, 3, 5, 6, 7};
		int sum=0; 
		int sum1=0;
		int n = arr.length;
		for(int i=1; i<=7; i++)
			sum+=i;
		for(int j=0; j<n; j++)
			sum1+=arr[j];
		int reqnumber = sum-sum1;
		System.out.println("Missing Number is: "+reqnumber);
	}
}