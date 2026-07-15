// q-1 (A)
class As21Address
{
	String city;
	int pincode;
	String state;
	void setAddress(String city,int pincode ,String state)
	{
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	};
	void display()
	{
		System.out.println("City :" + city);
		System.out.println("Pincode :" + pincode);
		System.out.println("State :" + state);
	}
}

class As21Person extends As21Address
{
	String name;
	int age;
	
	void setvalues(String a, int b,String city,int pincode ,String state )
	{
		setAddress(city,pincode,state);
		name =a;
		age =b;
		
	}
	void displayPerson()
	{
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
		display();  
	}
}

class As21ATest
{
	public static void main(String arg[])
	{
		As21Person p = new As21Person();
		p.setvalues("Laxmi",40,"Kota",308277,"Rajasthan");
		p.displayPerson();
	}
}