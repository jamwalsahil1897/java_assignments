package HashMap;

import java.util.*;

public class size {
	public static void main(String[] args) {
		
	HashMap<Integer,String> sizeOfHashMap=new HashMap<Integer,String>();
	//insert element using put method
	sizeOfHashMap.put(1,"sahil");
	sizeOfHashMap.put(2,"sj");
	sizeOfHashMap.put(3,"satyam");
	sizeOfHashMap.put(4,"rajan");
	sizeOfHashMap.put(5,"yogi");
	
	System.out.println("size of Hash map is "+sizeOfHashMap.size());
	}
}