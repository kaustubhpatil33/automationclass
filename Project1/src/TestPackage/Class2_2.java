package TestPackage;

public class Class2_2 extends Class1_1
{
	public Class2_2()
	{
		this(4,5);
		System.out.println("Child Default Constructor");
	}
	public Class2_2(int a)
	{
		this();
		System.out.println("Child One Parameterized Constructor");
	}
	public Class2_2(int a,int b)
	{
		super(6,7);
		System.out.println("Child Two Parameterized Constructor");
	}
	public Class2_2(int a,int b,int c)
	{
		this(1);
		System.out.println("Child Three Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Class2_2 obj=new Class2_2(45,4,5);
		
	}

}
