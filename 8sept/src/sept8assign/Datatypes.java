package sept8assign;

class Method{
	
	
void show(double rollNumber , String name ) {
  System.out.println(rollNumber+""+name);
}

void show(int id , short num) {
	System.out.println(id+""+num);
}
}
public class Datatypes {

	public static void main(String arg[]) {
		Method method = new Method();
		method.show(2, " Lalit");
		method.show(12, "34");
	}
}