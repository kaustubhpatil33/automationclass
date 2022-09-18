package TestPackage;

public class Sclass2 extends Sclass1
{
	public void C1()
	{
		super.P3(4, 6);
		System.out.println("Child Default Method");
		
	}
	public void C2(int a)
	{
		this.C3(4,5);
		System.out.println("Child One Parameterized Method");
	}
	public void C3(int a,int b)
	{
		this.C4(2, 5, 8);
		System.out.println("Child Two Parameterized Method");
	}
	public void C4(int a,int b,int c)
	{
		this.C1();
		System.out.println("Child Three Parameterized Method");
	}
	public static void main(String[] args) 
	{
		Sclass2 obj=new Sclass2();
		obj.C2(2);
		
	}

}
