class AssertDemo1
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);

		assert(x>10);

		System.out.println(x);		
	}	
}

/* In order to run this program you need to write the command as:
	
	java -ea AssertDemo1
 */