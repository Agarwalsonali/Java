// q-1 (C)
class As21Employee extends As21Person
{
	
	String org;
	String desig;
	int sal;
	void set_values(String name, int age, String city, int pincode, String state, String organization, String designation, int salary)
	{
       
		super.setvalues(name, age, city, pincode ,state);
		org = organization;
        desig = designation;
        sal = salary;
	}
	void show()
	{
		super.displayPerson();
		System.out.println("Organization: " + org);
        System.out.println("Designation: " + desig);
        System.out.println("Salary: " + sal);
	}
}
class As21CTest
{
	public static void main(String arg[])
	{
		As21Employee e1=new As21Employee();
		As21Employee e2=new As21Employee();
		e1.set_values("Ram", 30, "Jaipur", 325467, "Rajasthan", "Curaj", "Assistant Professor", 30000);
		e2.set_values("Krishna", 35, "Delhi", 452321, "UP", "DTU", "HOD", 50000);
		e1.show();
		e2.show();
	}
}
		
		
		