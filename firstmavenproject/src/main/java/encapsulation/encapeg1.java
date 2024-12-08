package encapsulation;

public class encapeg1
{
	private int age;
	private String name;
	
	public void setdetails(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public void getdetail()
	{
		System.out.println(age+" "+name);
	}
	
}
