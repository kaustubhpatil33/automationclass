package TestPackage;

public class Student 
{
	int Kapil=96, Rahul=85;
	
	public void method1()
	{
		System.out.println("Welcome to the Automation World");
	}
	
	public void method2()
	{
		System.out.println("Let's start to learn automation");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student abc=new Student();
		abc.method1();
		abc.method2();
		System.out.println("Kapil got good marks than Rahul=" +abc.Kapil +"%");
		System.out.println("Rahul got less marks than Kapil=" +abc.Rahul +"%");
	}

}
