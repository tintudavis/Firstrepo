package exception_handling;

public class Exception_eg1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		//System.out.println("hai");
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible");
			System.out.println(e);
		}
		}

}
