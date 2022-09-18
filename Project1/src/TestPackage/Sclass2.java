package TestPackage;

public class Sclass2 extends Sclass1
{
	public Sclass2()
	{
		System.out.println("Child Default Constructor");
	}
	public Sclass2(int a)
	{
		
		System.out.println("Child One Parameterized Constructor");
	}
	public Sclass2(int a,int b)
	{
		System.out.println("Child Two Parameterized Constructor");
	}
	public Sclass2(int a,int b,int c)
	{
		
		System.out.println("Child Three Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Sclass2 obj=new Sclass2(45,4,5);
		
	}

}
