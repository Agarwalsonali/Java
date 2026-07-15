// q-1
class point
{
	int x,y;
	void setpoints(int a,int b)
	{
		x=a;
		y=b;
	}
	void showpoints()
	{
		System.out.println("(" +x+ "," +y+ ")");
	}
	void compare(point p)
	{
		if(x>p.x)
			p.showpoints();
		else
			showpoints();
	}
}
class test
{
	public static void main(String ar[])
	{
		point p1=new point();
		point p2=new point();
		p1.setpoints(5,6);
		p2.setpoints(7,8);
		p1.compare(p2);
	}
}
	