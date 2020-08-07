class ArrayClass
{
	public static void main (String args [])
	{
		int arr[]={5, 10, 22};
		String name = arr.getClass().getName();
		System.out.println(name);
	}
}