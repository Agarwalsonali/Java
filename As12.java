// q-2
class line
{
	point sp, ep;
	void setline(int x1, int y1, int x2, int y2)
	{
		sp = new point();
		ep = new point();
		sp.setpoints(x1,y1);
		ep.setpoints(x2,y2);
	}
	void display()
	{
		sp.showpoints();
		ep.showpoints();
	}
	void setline_by_points(point p1, point p2)
	{
		sp=p1;
		ep=p2;
	}
    void calculateSlope()
	{
		double s= (ep.y-sp.y)/(ep.x-sp.x);
		System.out.println(" slope is : " +s);
	}
}
class linetest
{
	public static void main(String ar[])
	{
		line l=new line();
		l.setline(3,4,5,6);
		System.out.println(" l line is: ");
		l.display();
		l.calculateSlope();
		point p1=new point();
		point p2=new point();
		p1.setpoints(7,8);
		p2.setpoints(9,10);
		line l2=new line();
		l2.setline_by_points(p1,p2);
		System.out.println(" l2 line is: ");
		l2.display();
		l2.calculateSlope();
	}
}
		
