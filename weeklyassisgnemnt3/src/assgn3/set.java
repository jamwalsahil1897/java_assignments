package assgn3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class set {
	
	public static void main(String args[])throws IOException {
		
		FileReader fileReader=new FileReader("D:/IO/ss.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		Set<String> stateSet=new LinkedHashSet<String>();
		
		try {
			String reader=bufferedReader.readLine();
			
			while(reader!=null) {                                    //Traversing data from the file one by one
				stateSet.add(reader);
				reader=bufferedReader.readLine();
			}
			System.out.println("Total number of states : "+stateSet.size());
			System.out.println("Removing state delhi : "+stateSet.remove("Delhi"));
			System.out.println("After removing the Delhi : "+stateSet);
			System.out.print("State which starts with k : ");
			for(String state:  stateSet) {
				if(state.charAt(0)=='K' || state.charAt(0)=='k') {
					System.out.print(state+"  ");
				}
			}
			
			
			//Sorting state in another set
			List<String> stateList=new ArrayList<String>(stateSet);
			Collections.sort(stateList);
			Set<String> statesort=new LinkedHashSet<>(stateList);
			System.out.println("\nStates in sorted order : "+statesort);
			
			
			
		}
		finally {
			bufferedReader.close();
		}
				
	}

}