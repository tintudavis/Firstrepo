package firstmavenpackage;

public class AdditionOfNum_Instance 
{
	public void add()
	{
		int num1=34,num2=45,sum;
		sum=num1+num2;
		System.out.println("Sum="+sum);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		AdditionOfNum_Instance obj=new AdditionOfNum_Instance();
		obj.add();
	}

}
