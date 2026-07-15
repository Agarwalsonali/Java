//q-1 (A)
class Counter                             // Object-Level Synchronization
{
	int count=0;
	synchronized public void increment()
	{
		count++;
	}
		
	synchronized public int getCount()
	{
		return count;
	}
}
class CounterThread extends Thread
{
    Counter c1;
	public CounterThread(Counter c1){
		this.c1=c1;;
	}
	public void run(){
		for(int i=0;i<1000;i++){
			c1.increment();
		}
	}
}

class As71ATest
{
	public static void main(String arg[]) throws InterruptedException
	{
		Counter c1=new Counter();
		CounterThread t1=new CounterThread(c1);
		CounterThread t2=new CounterThread(c1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final count: " + c1.getCount());
	}
}
		
 