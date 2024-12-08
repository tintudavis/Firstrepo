package exception_handling;

public class Custom_exption_eg {

	public static void main(String[] args) throws VotingException
	{
		int age=2;
		if(age>=18)
			{
				System.out.println("Eligible for voting");
			}
		else
			{
				throw new VotingException("Candidate is under age for voting");
			}

	}

}
