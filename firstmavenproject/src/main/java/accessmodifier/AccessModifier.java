package accessmodifier;

public class AccessModifier
{
	
	public void display1()
	{
		System.out.println("This is a public modifier method");
	}
	
	private void display2()
	{
		System.out.println("This is a private modifier method");
	}
	
	protected void display3()
	{
		System.out.println("This is a protected modifier method");
	}
	
	void display4()
	{
		System.out.println("This is a default modifier method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier obj=new AccessModifier();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
