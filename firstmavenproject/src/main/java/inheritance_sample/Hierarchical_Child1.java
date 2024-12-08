package inheritance_sample;

public class Hierarchical_Child1 extends Hierarchical_Parent
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hierarchical_Child1 c1=new Hierarchical_Child1();
		int total=c1.base+5000;
		System.out.println("Salary of developer="+total);
	}

}
