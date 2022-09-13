package TestPackage;

public class Arithmatic2 {
	
	public int sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Subtraction result="+c);
		return c;
	}
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition result="+c);
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
		Arithmatic2 obj=new Arithmatic2();
		System.out.println("Formula is (((((10-2)+2)-2)*2)/2)");
		int subResult=obj.sub(10,2);
		int sumResult1=obj.sum(subResult,2);
		int subResult2=obj.sub(sumResult1,2);
		int multiResult=obj.multi(subResult2,2);
		obj.div(multiResult,2);

	}

}
