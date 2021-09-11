package sept8assign;

class Student1{
	int id;
	String name;
	int age ;
	
	// creating constructor
	Student1(int i , String n) {
	 id = i;
	 name = n;
	}	
	 // creating 3 argument constructor
	 Student1(int i , String n , int a){
		 id = i;
		 name = n;
		 age = a;
	 }
	 void display() {
	  System.out.println(id+""+name+""+age);
}
}
public class ConstructorOverloading {
public static void main(String arg[]) {
	
	Student1 s1 = new Student1(1, " SJ ");
	Student1 s2 = new Student1(2, " Rajan ", 23);
	s1.display();
	s2.display();
}
}