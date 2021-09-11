package sept7assign;

//Write a Java program to show 0-arguments constructor.
//Write a Java program to show parameterized constructor.
//Write a Java program to show constructor overloading.




public class Main {
	int length;
	int bredth;
  Main() //default constructor -0 arguments
	{
		System.out.println("HEYYYAAAAAAA, Meet me a default contructor");
	}
  Main(int a,int b) //parameterized constructor
  {
  	int length=a;
  	int bredth=b;
  	int areaofrect=length*bredth;
  	System.out.println("Area of rectangle"+" "+areaofrect);
  }
	Main(int l,int b,int h) // function Overloading/ Constructor Overloading
	{
		int areaofcuboid=2*(l*b+b*h+h*l);
		System.out.println("Area od cuboid"+areaofcuboid);
	}
	public static void main(String[] args)
	{
		Main obj=new Main();
		Main obj2=new Main(10,30);
		Main obj3=new Main(12,12,24);
		
	}

}
