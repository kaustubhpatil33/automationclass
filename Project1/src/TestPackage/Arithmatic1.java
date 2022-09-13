package TestPackage;

public class Arithmatic1 {
	//(((((10+2)+2)-2)*2)/2)
	public int sum(int a,int b)
	{
		System.out.println("This is latest code");
		int c=a+b;
		System.out.println("Addition result="+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction result="+c);
		return c;
	}
	public int multi(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication result="+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Division result="+c);
	}

	public static void main(String[] args) 
	{
		Arithmatic1 obj=new Arithmatic1();
		System.out.println("Formula is (((((10+2)+2)-2)*2)/2)");
		int sumResult=obj.sum(10,2);
		int sumResult1=obj.sum(sumResult,2);
		int subResult=obj.sub(sumResult1,2);
		int multiResult=obj.multi(subResult,2);
		obj.div(multiResult,2);
	}

}
