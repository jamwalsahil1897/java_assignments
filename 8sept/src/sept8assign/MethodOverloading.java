package sept8assign;

class Constructor{

	 
	void display(String id) {
	System.out.println( id+"");
	}
    
  
	  void display(int rollNumber , String name){
	System.out.println(rollNumber+""+name);
  }
  }
  
public class MethodOverloading {
	public static void main(String arg[]) {
		Constructor a1 = new Constructor();
		a1.display("Sj");
		Constructor a2 = new Constructor();
		a2.display(2, " RAJAN");
		
	}
}