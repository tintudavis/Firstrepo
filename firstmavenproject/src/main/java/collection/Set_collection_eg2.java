package collection;

import java.util.HashSet;
import java.util.Set;

public class Set_collection_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj = new HashSet<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add("A");
		//obj.add(null);
		obj.add("E");
		//obj.add(null);
		System.out.println(obj);
		System.out.println(obj.size());
		obj.remove("A");
		System.out.println(obj);
		System.out.println(obj.contains("B"));
		
}
}
