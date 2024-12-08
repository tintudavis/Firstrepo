package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_eg1
{

	public static void main(String[] args)
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Green");
		obj.add("Blue");
		obj.add("Violet");
		
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj);
	}

}
