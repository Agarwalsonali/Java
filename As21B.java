// q-1 (B)
class As21Student extends As21Person
{
	
	String branch;
	int semester;
	void setvalues(String name, int age, String city, int pincode, String state, String d, int e )
	{
		
		super.setvalues(name, age, city, pincode ,state);
		branch =d;
		semester =e;
	}
	void displayStudent()
	{
		super.displayPerson();
		System.out.println("Branch :" +branch);
		System.out.println("Semester :" +semester);
	}
}
class As21BTest
{
	public static void main(String arg[])
	{
		As21Student s1=new As21Student();
		As21Student s2=new As21Student();
		As21Student s3=new As21Student();
		s1.setvalues("Sonali", 20, "Kota", 325467, "Rajasthan", "CSE", 4);
		s2.setvalues("Urvi", 20, "Jaipur", 354782, "Rajasthan", "ECE", 4);
		s3.setvalues("Saumya", 20, "Patna", 352396, "Bihar", "BME", 4);
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
	}
}