package HashMap;

import java.util.HashMap;

public class remove {
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap= new HashMap<Integer,String>();
		//insert element using put method
		hashmap.put(1,"sj");
		hashmap.put(2,"satyam");
		hashmap.put(3,"rajan");
		
		System.out.println("Before removing "+hashmap);
		
		String result=hashmap.remove(hashmap);
		
		//Remove all of the mapping
		System.out.println("after removing "+result);
	}
}