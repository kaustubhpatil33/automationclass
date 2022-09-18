package TestPackage;

public class Swift extends Maruti
{
	public void modeltype()
	{
		System.out.println("Swift Car");
	}
	public static void main(String[] args) 
	{
		Swift obj=new Swift();
		obj.modeltype();
		obj.baseprice();
		obj.price=122;
		System.out.println(obj.price);
		
	}

}
