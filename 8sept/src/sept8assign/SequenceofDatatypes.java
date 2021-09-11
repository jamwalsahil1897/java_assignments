package sept8assign;

class Overloading{
	
void sequence(int id , String name) {
	System.out.println(id+""+name);
}

void sequence (String name , int id) {
	System.out.println(name+""+id);
}
}
public class SequenceofDatatypes {
	public static void main(String arg[]) {
		Overloading methods = new Overloading();
		methods.sequence(2, " Ram");
		methods.sequence("Laxam ", 12);
	}

}