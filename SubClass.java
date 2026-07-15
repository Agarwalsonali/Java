import mypack.Class1;

public class SubClass extends Class1
{
	public String myMethod()
	{
		return "Hello from SubClass";
	}
	public static void main(String ar[])
	{
		SubClass obj3 = new SubClass();
		System.out.println(obj3.myMethod());
	}
}