package exception_handling;

public class Exception_eg6_throws
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age=10;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Candidate is under age for voting");
		}
		
	}

}
