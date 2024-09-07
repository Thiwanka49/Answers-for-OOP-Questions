package Ex1;


class Student
{
	String name;
	String ditno;
	String address;
	
}

public class Test 
{

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name = "Nimal";
		s1.ditno = "IT123";
		s1.address = "Colombo";
		
		Student s2 =new Student();
		s2.name ="Kamal";
		s2.ditno = "IT565";
		s2.address = "Malabe";
		
		System.out.println("Name: "+s1.name+ "\nDitNo:"+s1.ditno+"\nAddress:"+s1.address);
		System.out.println("Name: "+s2.name+"\nDitNo:"+s2.ditno +"\nAddress"+s2.address);
	}
}
