import java.util.Scanner;
interface Q1In1
{
    void  getArea();
    void  getPerimeter();
    void  getProperties();
    default void fillColor(String color_name)
    {
        System.out.println("You haven't set the color");
    }
    default void fillOutline(String color_name)
    {

      System.out.println("You haven't set the color");
    }
    default void getColor()
    {
      System.out.println("You haven't set the color");
    }
}

abstract class Q1ShapeInfo implements Q1In1
{   
    String color_name="No color filled";
    String outline_color="No color set";
    public void fillColor(String color)
    {
        color_name = color;
        //System.out.println("color is:"+color_name);
    }
    public void fillOutline(String color)
    {
        outline_color = color;
       // System.out.println("outline color is:"+outline_color);
    }
    public void getColor()
    {
        System.out.println("background color is :"+color_name);
        System.out.println("outline color is :"+outline_color);
        System.out.println("######################################################");
    }

}


class Q1Circle extends Q1ShapeInfo 
{
    int radii;
   
    Q1Circle(int r)
    {
        radii = r;
    }
    
    public void getArea()
    {
        System.out.println("*********Circle***********");
        float area = 3.14f * radii *radii;
        System.out.println("The area of the circle is:"+ area);
    }
    public void getPerimeter()
    {
        float perimeter = 3.14f * 2*radii;
        System.out.println("The perimeter of the circle is:"+ perimeter);
    }
    public void getProperties()
    {
        System.out.println("Radius of the circle is:"+radii);
    }
}


class Q1Rectangle extends Q1ShapeInfo 
{
    int l,w;
    Q1Rectangle(int a,int b)
    {
        l = a;
        w = b;
    }
    public  void getArea()
    {
        System.out.println("*********Rectangle***********");
        int area =l*w;
        System.out.println("The area of the Rectangle is:"+ area);
    }
    public void getPerimeter()
    {
        int perimeter = 2*(l+w);
        System.out.println("The perimeter of the Rectangle is:"+ perimeter);
    }
    public void getProperties()
    {
        System.out.println("length of the Rectangle is:"+l);
        System.out.println("width of the Rectangle is:"+w);
    }


}
class Q1Triangle extends Q1ShapeInfo 
{
    int a,b,c;
    Q1Triangle(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getArea()
    {
        System.out.println("*********Triangle***********");
        float s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the Triangle is:"+ area);
    }
    public void getPerimeter()
    {
        int perimeter = a+b+c;
        System.out.println("The perimeter of the Triangle is:"+ perimeter);
    }
    public void getProperties()
    {
        System.out.println("size a of the triangle is:"+a);
        System.out.println("size b of the triangle is:"+b);
        System.out.println("size c of the triangle is:"+c);
    }

}

class Q1PrintBoard
{
    Q1In1 shapes[];
    int count;
    Q1PrintBoard(int size)
    {
        shapes = new Q1In1[size];
        count = 0;
    }
    void AddShape(Q1In1 shape)
    {
        if(count < shapes.length)
        {
            shapes[count] = shape;
            count++;
        }else
        {
            System.out.println("Board is full");
        }
    }
    void displayInfo()
    {
        for(int i=0; i<count;i++)
        {
            shapes[i].getArea();
            shapes[i].getPerimeter();
            shapes[i].getProperties();
            if( shapes[i] instanceof Q1Circle)
            {
                Q1Circle c = (Q1Circle)shapes[i];
                c.getColor();
            }else if(shapes[i] instanceof Q1Rectangle)
            {
                Q1Rectangle r = (Q1Rectangle)shapes[i];
                r.getColor();
            }else if(shapes[i] instanceof Q1Triangle)
            {
                Q1Triangle t = (Q1Triangle)shapes[i];
                t.getColor();
            }
            else{
                System.out.println("unKnown shape");
            }
        }
            
    }

}

class Question1
{
    Scanner scn = new Scanner(System.in);
    void TakeColor(Q1In1 shape)
    {
        System.out.println("Do you want to set colors(yes/no):");
        String fl = scn.nextLine();
        if(fl.equals("yes"))
        {
            System.out.println("Enter the background color:");
            String bg = scn.nextLine();
            shape.fillColor(bg);
            System.out.println("Enter the outline color:");
            String outline = scn.nextLine();
            shape.fillOutline(outline);

        }
       
    }
    public static void main(String arg[])
    {
        Question1 q1 = new Question1();
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of Printboard:");
        int s = sc.nextInt();
        Q1PrintBoard pb = new Q1PrintBoard(s);
        Boolean exit = false;
        while(!exit)
        {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Rectangle");
            System.out.println("3. Create Triangle");
            System.out.println("4. Display Board Info");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter radii of Circle:");
                    int rd = sc.nextInt();
                    Q1Circle cle = new Q1Circle(rd);
                    q1.TakeColor(cle);
                    pb.AddShape(cle);
                    break;
                
                case 2:
                    System.out.print("Enter length of Rectangle: ");
                    int lth = sc.nextInt();
                    System.out.print("Enter width of Rectangle: ");
                    int wth = sc.nextInt();
                    Q1Rectangle rtg = new Q1Rectangle(lth,wth);
                    q1.TakeColor(rtg);
                    pb.AddShape(rtg);
                    break;
                case 3:
                    System.out.print("Enter first side of triangle: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second side of triangle: ");
                    int b = sc.nextInt();
                    System.out.print("Enter third side of triangle: ");
                    int c = sc.nextInt();
                    Q1Triangle tle = new Q1Triangle(a,b,c);
                    q1.TakeColor(tle);
                    pb.AddShape(tle);
                    break;
                case 4:
                    pb.displayInfo();
                    break;
                case 5:
                    exit=true;
                    break;
                 default:
                    System.out.println("you can only choose circle(1),rectangle(2) or triangle(3).");
            }
        }
        sc.close();
        q1.scn.close();
    }
}
