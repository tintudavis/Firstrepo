package collection;

import java.util.ArrayList;

public class Arraylist_eg1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("One");
		obj.add("Two");
		obj.add("Three");
		obj.add("Four");
		obj.add("Five");
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Red");
		obj1.add("green");
		
		obj.addAll(obj1);
		System.out.println(obj);
		System.out.println(obj.contains("Red"));
		System.out.println(obj.get(3));
		System.out.println(obj.isEmpty());
		obj.remove(1);
		System.out.println(obj);
		obj.remove("green");
		System.out.println(obj);
		System.out.println(obj.size());
		
		
	}

}
