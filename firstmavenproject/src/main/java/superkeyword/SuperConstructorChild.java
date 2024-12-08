package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		
		super(2,3);
		System.out.println("child class constructor");
	}
	
	public SuperConstructorChild(int a)
	{
		super();
		System.out.println("Number1="+a);
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();
		SuperConstructorChild obj1=new SuperConstructorChild(2);
		
	}

}
