package superkeyword;

public class SuperConstructorParent 
{
	public SuperConstructorParent(int num1,int num2)
	{
	 int sum=num1+num2;
	 System.out.println("Sum="+sum);
	}
	
	public SuperConstructorParent()
	{
		System.out.println("parent class default constructor");
	}
}
