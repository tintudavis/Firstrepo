package collection;

import java.util.LinkedList;

public class Linked_list_eg 
{

	public static void main(String[] args) 
	{
		LinkedList<String> obj=new LinkedList<String>();
		
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		System.out.println(obj);
		
		obj.add(0, "Friuts");
		System.out.println(obj);
		
		LinkedList<String>  obj1=new LinkedList<String>();
		obj1.add("Color");
		obj1.add("Red");
		obj1.add("Orange");
		obj1.add("Yellow");
		System.out.println(obj1);
		
		obj.addAll(obj1);
		System.out.println(obj);
		
		System.out.println(obj.contains("Red"));
		
		System.out.println(obj.get(4));
		System.out.println(obj.isEmpty());
		obj.remove(1);
		System.out.println(obj);
		System.out.println(obj.size());
	}

}
