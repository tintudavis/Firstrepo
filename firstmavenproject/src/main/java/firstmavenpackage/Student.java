package firstmavenpackage;

public class Student
{

	public void display()
	{
		int roll=1;
		String name="Tintu";
		char grade='A';
		System.out.println("Roll "+roll);
		System.out.println("Name :"+name);
		System.out.println("Grade: "+grade);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.display();
	}

}
