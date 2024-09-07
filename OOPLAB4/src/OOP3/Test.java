package OOP3;

public class Test 
{

	public static void main(String[] args) 
	{
		/*Student s1 = new Student("Nimal","IT666","Mathugama");
		s1.name="Nimal";
		s1.ditno="IT123";
		s1.address="Colombo";
		
		Student s2=new Student("Amal","IT666","Kaluthara");
		s2.name="Kamal";
		s2.ditno="IT565";
		s2.address="Malabe";
		
		System.out.println("Name:"+s1.name+"\nDitNo:"+s1.ditno+"\nAddress:"+s1.address);
		System.out.println("Name:"+s2.name+"\nDitNo:"+s2.ditno+"\nAddress:"+s2.address);*/
		
		Student s1 = new Student();
		s1.setName("Nimal");
		s1.setDitno("IT567");
		s1.setAddress("Colombo");
		
		System.out.println(s1.getDetails());
		
	}
}
