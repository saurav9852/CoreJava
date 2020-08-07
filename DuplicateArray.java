class DuplicateArray
{
	public static void main (String args [])
	{
		int arr [] = {4, 1, 8, 11, 18 , 6, 9, 11};
		int n = arr.length;
		for(int i=0; i<n; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					if(arr[i]==arr[j]&&j!=i)
					System.out.println("Duplicate elements: "+arr[i]+" at index: "+i+" and "+j);
				}
			}	
			System.out.println(arr.getClass().getName());
			int myarr[] = new int[7];
			System.out.println(myarr.getClass().getName());
	}
}