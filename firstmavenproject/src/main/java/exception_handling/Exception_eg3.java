package exception_handling;

public class Exception_eg3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println("Sum="+c);
		}
		catch(Exception e)
		{
			System.out.println("Division by zero is not possible");
		}
		finally
		{
			System.out.println("Execution completed successfully");
		}
		
	}

}
