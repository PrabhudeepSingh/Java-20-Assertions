class AssertDemo2
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);

		assert(x>10):"Here value of x should be greater than 10.";

		System.out.println(x);		
	}	
}
