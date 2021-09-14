package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo{
	 public static void main(String args[]){

	  HashSet<String> namelist=new HashSet<String>();

	// Elements are added using add() method
	  
	  namelist.add("sahil");
	  namelist.add("rajan");
	  namelist.add("satyam");
	  namelist.add("Yogi");
	  namelist.add("Ram");
	  namelist.add(null);
	 
	  Iterator itr=namelist.iterator();
	  while(itr.hasNext()){
	   System.out.println(itr.next());
	  }
	 }
	}
