package polymorphism;

public class Childeg1 extends Parenteg1
{
	public void add(int num1,int num2)
	{
		super.add(10, 20);
		int dif=num1-num2;
		System.out.println("Difference= "+dif);
	}
	
	public static void main(String args[])
	{
		Childeg1 eg=new Childeg1();
		eg.add(20, 10);
	}
}
