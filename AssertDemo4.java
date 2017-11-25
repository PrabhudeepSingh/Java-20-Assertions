class AssertDemo4
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);

		assert(x>10): mth();

		System.out.println(x);		
	}	

	public static String mth()
	{
		return "Here value of x should be greater than 10.";
	}
}
