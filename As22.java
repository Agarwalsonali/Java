// q-2
class Calculator
{
	static void addition(int x,int y)
	{
		int c=x+y;
		System.out.println("Sum is:" +c);
	}
	static void addition(float x,float y)
	{
		float c=x+y;
		System.out.println("Sum is:" +c);
	}
	
	public static void main(String arg[])
	{
		addition(4,5);
		addition(5.4f,8.3f);
	}
}