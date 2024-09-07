package OOP3;

public class Student 
{
	String name;
	String ditno;
	String address;
	
	/*public Student(String newName,String newditno,String newAddress)
	{
		this.name=newName;
		this.ditno=newditno;
		this.address=newAddress;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	String getDetails()
	{
		String s = "I am a student.\n My name is "+getName()+"I am from"+getAddress()+"My dit no is"+getDitno();
		return s;
	}
}
