// q-2
class stack
{
	int arr[];
	int top;
	int size;
	stack(int n)
	{
		arr=new int[n];
		size=n;
		top=-1;
	}
	private boolean isEmpty()
	{
	    return top==-1;
    }
	private boolean isFull()
	{
		return top==size-1;
	}
	int top()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty.");
			return -1;
		}
		return arr[top];
	}
	void push(int d)
	{
		if(isFull())
		{
			System.out.println("Stack is Full.");
			return;
		}
		else
		{
			top++;
			arr[top]=d;
		}
	}
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty.");
			return -1;
		}
		return arr[top--];
	}
}
class As32Test
{
	public static void main(String arg[])
	{
		stack s=new stack(5);
		s.push(4);
		System.out.println("Pushed element:" +4);
		s.push(6);
		System.out.println("Pushed element:" +6);
		s.push(8);
		System.out.println("Pushed element:" +8);
		System.out.println("Popped element:" +s.pop());
		System.out.println("Top element:" +s.top());
	}
}
		
		
			
		
	