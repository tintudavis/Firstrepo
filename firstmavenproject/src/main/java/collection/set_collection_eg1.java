package collection;

import java.util.HashSet;
import java.util.Set;

public class set_collection_eg1
{

	public static void main(String[] args) 
	{
		Set obj=new HashSet();
		
		//Adding values
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj);
		
		//removing values
		obj.remove(2);
		System.out.println(obj);
		
		

	}

}
