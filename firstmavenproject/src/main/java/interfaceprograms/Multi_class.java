package interfaceprograms;

public class Multi_class implements Multi_1,Multi_2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_class obj=new Multi_class();
		obj.add();
		obj.display1();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10,b=30,c;
		c=a+b;
		System.out.println("sum="+c);
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance program");
	}

}
