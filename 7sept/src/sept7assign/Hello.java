package sept7assign;

//Write a java program in which you will declare two
//interface sum and Add inherits these interface through class A1
//and display their content.
interface Sum1{
	void sumnumbers();
}
interface add
{
	void addstrings();
}
class A1 implements Sum1,add
{
	public void sumnumbers()
	{
		int a=25;
		int b=13;
		int total=a+b;
		System.out.println(total);
	}


	public void addstrings() {
		// TODO Auto-generated method stub
			String a1="s3";
			String b1="ss";
			String total=a1+b1;
			System.out.println(total);
		}	
		
}	

public class Hello {
	public static void main(String[] args) {
A1 ob=new A1();
ob.sumnumbers();
ob.addstrings();

}
}
