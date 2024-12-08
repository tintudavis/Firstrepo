package interfaceprograms;

public class Interface_eg2 implements Interface_eg1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_eg2 obj=new Interface_eg2();
		obj.display();
		obj.display1();

	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("Inteface program");
	}
	public void display1()
	{
		System.out.println("Hai");
	}
}
