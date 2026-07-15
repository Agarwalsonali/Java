// q-4
class TwoD_array     // 2-D Data Structure
{
	int array[][];
	int rows=6;
	int num=5;
    void set() 
	{
		array= new int[rows][];
		for(int i=0; i<rows; i++)
		{
			if(i%2==0)
				array[i]=new int[3];
			else
				array[i]=new int[4];
			
			
			for(int j=0;j<array[i].length; j++)
			{
				array[i][j]=num++;
			}
		}
	}
	void display()
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class As34Test
{
	public static void main(String arg[])
	{
		TwoD_array ob=new TwoD_array();
		ob.set();
		ob.display();
	}
}
		
		
		
		
		
	