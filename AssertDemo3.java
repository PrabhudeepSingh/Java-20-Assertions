class AssertDemo3
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);

		assert(x==10): ++x;

		System.out.println(x);		
	}	
}
