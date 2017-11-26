class AssertDemo5
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);

		try
		{
			assert (x>10);
		}	
		catch(AssertionError e)
		{
			System.out.println("I am stupis because i am catching AssertionError.");
		}

		System.out.println(x);
	}
}