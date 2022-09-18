package TestPackage;

public class Sclass1 
{
	public void P1()
	{
		this.P4(6, 8, 9);
		System.out.println("Parent Default Method");
		
	}
	public void P2(int a)
	{
		this.P1();
		System.out.println("Parent One Parameterized Method");
	}
	public void P3(int a, int b)
	{
		this.P2(4);
		System.out.println("Parent Two Parameterized Method");
	}
	public void P4(int a, int b,int c)
	{
		System.out.println("Parent Three Parameterized Method");
	}

}
