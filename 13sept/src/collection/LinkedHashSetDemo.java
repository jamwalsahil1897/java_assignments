package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		Set<String> data=new LinkedHashSet<String>();
		
		// Elements are added using add() method
		
		data.add("Ram");
		data.add("shayam");
		System.out.println(data);
	}
}