package aggregation;

public class Employee
{
	int id;
	String name;
	Address adr;

	public Employee(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public void displayemp()
	{
		System.out.println("ID: "+id +"  Name: "+ name);
		System.out.println(adr.street+" "+adr.state+" "+adr.country);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Address a=new Address("aluva","Kerala","India");
		Employee emp=new Employee(1,"Tintu",a);
		emp.displayemp();

	}

}
