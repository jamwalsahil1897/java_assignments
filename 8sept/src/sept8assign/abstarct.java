package sept8assign;

abstract class A{
	abstract void show();
}
	class B extends A{
		void show() {
		System.out.println("  Me = B ");
	}
	}
public class abstarct {
	public static void main(String arg[]) {
		B baseB = new B();
		baseB.show();
}

}