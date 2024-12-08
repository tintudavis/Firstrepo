package superkeyword;

public class SuperMethodChild extends SuperMethodParent 
{
	public void display1()
	{
		super.display();
		System.out.println("Child class method");
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.display1();
		
		
	}

}
