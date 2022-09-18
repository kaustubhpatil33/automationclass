package TestPackage;

public class Class1_1 
{
	public Class1_1()
	{
		this(3,6,8);
		System.out.println("Parent Default Constructor");
		
	}
	public Class1_1(int a)
	{
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	public Class1_1(int a, int b)
	{
		this(5);
		System.out.println("Parent Two Parameterized Constructor");
	}
	public Class1_1(int a, int b,int c)
	{
		System.out.println("Parent Three Parameterized Constructor");
	}
}
