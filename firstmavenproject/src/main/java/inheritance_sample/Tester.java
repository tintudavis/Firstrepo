package inheritance_sample;

public class Tester extends Employee
{

	public static void main(String[] args)
	{
	
		Tester t1=new Tester();
		int sal=t1.base_sal+5000;
		System.out.println("Total salary="+sal);

	}

}
