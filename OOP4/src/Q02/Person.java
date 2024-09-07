package Q02;

public class Person 
{
	private String name;
	private String address;
	
	public Person(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	
	 void showDetails()
	{
		System.out.println("name = "+this.name);
		System.out.println("address = "+this.address);
	}
}
