package superkeyword;

public class SuperinstanceChildeg1 extends SuperInstanceeg1
{
	String color="white";
	
	public void display()
	{
		System.out.println("Parent class color is "+super.color);
		System.out.println("Child class color is "+color);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		SuperinstanceChildeg1 obj=new SuperinstanceChildeg1();
		obj.display();

	}

}
