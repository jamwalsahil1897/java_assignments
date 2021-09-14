package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class updatelement {
	public static void main(String[] args) {
		List<String> updateElement=new ArrayList<String>();
		
		//Element are added using add method
		
		updateElement.add("sj");
		updateElement.add("satyam");
		updateElement.add("rajan");
		updateElement.add("yogi");
		
		System.out.println("Arraylist before : "+updateElement);
		
		updateElement.set(0,"sahil jamwal");
		
		//updating index no. 1 (satyam to satyam tripathi)
		
		System.out.println("Arraylist after update : "+updateElement);
	}
}