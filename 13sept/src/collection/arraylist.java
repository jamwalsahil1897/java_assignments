package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
	public static void main(String args[]) {
		ArrayList<String> arrlist1=new ArrayList<String>();
		
		// Elements are added using add() method
		
		arrlist1.add("kiwi");
		arrlist1.add("banana");
		arrlist1.add("apple");
		
		ArrayList<String> arrlist2=new ArrayList<String>();
		
		// Elements are added using add() method
		
		arrlist2.add("lichi");
		arrlist2.add("guava");
		
		
		
		arrlist2.addAll(arrlist1);
		Iterator itr= arrlist2.iterator();
		
		while(itr.hasNext()) {
			System.out.println("list of fruit after adding: "+itr.next());
		}
		
	}
}