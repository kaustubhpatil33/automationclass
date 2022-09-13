package TestPackage;

public class Class1 
{
	public Class1()
	{
		System.out.println("Dafault Constructor");
	}
	public Class1(int a)
	{
		System.out.println("One Parameterzied Constructor");
	}
	public Class1(int a, int b)
	{
		System.out.println("Two Parameterzied Constructor");
	}
	public Class1(int a, int b, int c)
	{
		System.out.println("Three Parameterzied Constructor");
	}
	public Class1(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterzied Constructor");
	}
	
	public static void main(String[] args)
	{
		Class1 c1=new Class1(1,2,3,4);
		Class1 c2=new Class1();
		Class1 c3=new Class1(2);
		Class1 c4=new Class1(1,2);
		Class1 c5= new Class1(1,3,5);
				
				
	}

}
