package inheritance_sample;

public class HierarchicalChild2 extends Hierarchical_Parent
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hierarchical_Child1 c1=new Hierarchical_Child1();
		int total=c1.base+10000;
		System.out.println("Salary of tester="+total);
	
	}

}
