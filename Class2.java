import mypack.Class1;

public class Class2
{
	public void useClass1(){
		Class1 obj1 = new Class1();
		System.out.println(obj1.myMethod());
	}
	public static void main(String ar[])
	{
		Class2 obj2 = new Class2();
		obj2.useClass1();
	}
}

