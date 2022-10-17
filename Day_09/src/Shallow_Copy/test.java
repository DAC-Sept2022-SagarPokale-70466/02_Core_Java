package Shallow_Copy;

public class test {

	public static void main(String[] args) {
		
//		Person p1 = new Person("Sagar",30,01,2000);
//		System.out.println(p1);
//		
//		Person p2 = p1;
//		p2.setName("Sush");
//		System.out.println(p2);

		// Better Version
		
		Person p1 = new Person("Sagar", 30,01,2000);
		System.out.println(p1);
		Person p2 = null;
		try 
		{
			p2 = (Person) p1.clone();				// Here typecasting becuse we are getting object referece then convert into Person
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning Error");
		}
		System.out.println("Success");
		p2.setName("Sush");
		p2.changeDate();
		System.out.println(p1);
		System.out.println(p2);
	}
	

}
