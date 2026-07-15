// q-3
class ComplexNumber
{
	double real;
	double imag;
	ComplexNumber(double real, double imag)
	{
		this.real=real;
		this.imag=imag;
	}
}
class Queue
{
	ComplexNumber arr[];
	int rear;
	int front;
	int size;
	Queue(int n)
	{
		arr=new ComplexNumber[n];
		size=n;
		rear=-1;
		front=-1;
	}
	private boolean isEmpty()
	{
	    return front==-1;
    }
	private boolean isFull()
	{
		return rear==size-1;
	}
	void enqueue(ComplexNumber element)
	{
		if(isFull())
		{
			System.out.println("Queue is Full."); 
			return;
		}
		else if(front== -1 && rear==-1)
		{
			front=0;
			rear=0;
			arr[rear]=element;
		}
		else
		arr[++rear]=element;
	}
	ComplexNumber dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return null;
		}
		ComplexNumber element=arr[front];
		front++;
		if(front>rear)
		front=rear=-1;
        return element;
	}
}
class As33Test
{
	public static void main(String arg[])
	{
		Queue q=new Queue(5);
		q.dequeue();
		q.enqueue(new ComplexNumber(3,2));
		System.out.println("Enqueued element:" +3+ "+" +2+ "i");
		q.enqueue(new ComplexNumber(2,-1));
		System.out.println("Enqueued element:" +2+ "+" +(-1)+ "i" );
		q.enqueue(new ComplexNumber(4,5));
		System.out.println("Enqueued element:" +4+ "+" +5+ "i");
		System.out.println("Dequeued element:" +q.dequeue());
    }
}