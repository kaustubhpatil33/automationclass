package TestPackage;

public class Class2 
{
	public void default1()
	{
		this.threeparam(1,2,3);
		System.out.println("Default method");
		this.fourparam(1,2,3,4);
		this.oneparam(1);
		this.twoparam(1,2);
	}
	public void oneparam(int a)
	{
		System.out.println("One Parameterized method");
	}
	public void twoparam(int a, int b)
	{
		System.out.println("Two Parameterized method ");
	}
	public void threeparam(int a, int b, int c)
	{
		System.out.println("Three Parameterized method");
	}
	public void fourparam(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized method");
	}

	public static void main(String[] args) 
	{
		Class2 obj=new Class2();
		obj.default1();

	}

}
