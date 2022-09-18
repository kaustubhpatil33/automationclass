package TestPackage;

public class SwirftVDI extends Swift
{
	public void car()
	{
		System.out.println("SwiftVDI");
	}
	public static void main(String[] args) 
	{
		SwirftVDI s= new SwirftVDI();
		s.car();
		s.modeltype();
		s.baseprice();
		s.price=150;
		System.out.println(s.price);
		
		
	}

}
