// q-3
class Complex
{
	int real;
	int imag;
	Complex()
	{
		real=0;
		imag=0;
	}
	Complex(int r,int i)
	{
		real=r;
		imag=i;
	}
	void display()
	{
		System.out.println(real+ "+" +imag+ "i");
	}
	Complex add(int r1, int i1, int r2, int i2)
	{
		return new Complex(r1+r2, i1+i2);
	}
	Complex add(Complex c1, Complex c2)
	{
		return new Complex(c1.real+c2.real,c1.imag+c2.imag);
	}
	void add(Complex c)
	{
		this.real+= c.real;
		this.imag+= c.imag;
	}
}
class As23Test
{
	public static void main(String arg[])
	{
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(5,-2);
		Complex c3=new Complex();
		c3=c1.add(c1,c2);
		c3.display();
		c1.add(c2);
		c1.display();
		Complex c4=c1.add(3,4,5,6);
		c4.display();
	}
}
		
		
		
		
	
	