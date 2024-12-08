package polymorphism;

public class Childeg2 extends Parenteg2
{

	public void display()
	{
		super.display();
		System.out.println("This is child class method");
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Childeg2 eg=new Childeg2();
		eg.display();
	}

}
