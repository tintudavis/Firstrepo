package collection;

import java.util.ArrayList;
import java.util.List;

public class Generic_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();
		obj.add("Tintu");
		obj.add("Harsha");
		obj.add("Dani");
		obj.add("Tintu");
		obj.add("Annex");
		obj.add("Aiswarya");
		System.out.println(obj);
		obj.set(5, "Anju"); //replace element in index position 5
		System.out.println(obj);
		
		System.out.println(obj.indexOf("Tintu")); //First occurance index position
		System.out.println(obj.lastIndexOf("Tintu"));//Last occurance index position
		
		System.out.println(obj.remove(0));
		System.out.println(obj);
		obj.remove("Dani");
		System.out.println(obj);
		System.out.println(obj.get(2)); //Retrieve a particular value - specify index value
		
		System.out.println(obj.contains("Anju")); //Return true if element exists
		
	}

}
