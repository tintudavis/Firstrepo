package abstract_package;

public class Abstract_eg4 extends Abstract_eg3
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Abstract_eg4 obj=new Abstract_eg4();
		obj.display();
		obj.add();
	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("Abstract method display");
		
	}

	@Override
	public void add() 
	{
		// TODO Auto-generated method stub
		int a=10,b=20;
		int c=a+b;
		System.out.println("Sum= "+c);
		
	}

}
