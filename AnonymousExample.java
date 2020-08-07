interface Age
{
	int x=21;
	void getAge();
}
class AnonymousExample
{
	public static void main (String args [])
	{
		Age obj = new Age()				//Anonymous Class
		{
			public void getAge()
			{
				System.out.println("Age of the Person: "+x);
			}
		};
		obj.getAge();
	}
}