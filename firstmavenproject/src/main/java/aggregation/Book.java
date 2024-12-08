package aggregation;

public class Book 
{
	
	String bookname;
	int id;
	Author ref;
	public Book(String bookname,int id,Author ref)
	{
		this.bookname=bookname;
		this.id=id;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(ref.name+" "+ref.age);
		System.out.println(bookname+" "+id);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Author obj=new Author("tintu",25);
		Book obj1=new Book("java",23,obj);
		obj1.display();
	}

}
