package sept10assign;

public class EqualsIgnoreCase {
	public static void main(String args[]){  
		
		String string1="Sahil";  
		String string2="sahil";  
		String string3="SAHIL";  
		String string4="SJ"; 
		
		System.out.println(string1.equalsIgnoreCase(string2));     //true because content and case both are same  
		System.out.println(string1.equalsIgnoreCase(string3));      //true because case is ignored  
		System.out.println(string1.equalsIgnoreCase(string4));       //false because content is not same  
		}

}
