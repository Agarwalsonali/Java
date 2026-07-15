// q-1 (D)
class As21DTest
{
	public static void main(String arg[])
	{
		As21Person p1 = new As21Person();
		p1.setvalues("Sita",25,"Jaipur",343357,"Rajasthan");
		p1.displayPerson();
		As21Student s4=new As21Student();
		s4.setvalues("Sakshi", 20, "Jaipur", 333457, "Rajasthan", "CSE", 4);
		s4.displayStudent();
		As21Employee e3=new As21Employee();
		e3.set_values("Mayank", 40, "Gurugram", 325877, "Haryana", "Curaj", "Assistant Professor", 35000);
		e3.show();
	}
}