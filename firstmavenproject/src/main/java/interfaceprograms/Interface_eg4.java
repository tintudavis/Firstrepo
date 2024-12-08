package interfaceprograms;

public class Interface_eg4 implements Interface_eg3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_eg4 obj=new Interface_eg4();
		obj.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		c=a+b;
		System.out.println("sum= "+c);
	}

}
