// q-2 (A)
class CounterObjectLevel                            // Object-Level Synchronization
{
	int count=0;
	final Object lock=new Object();
	public void increment()
	{
		synchronized(lock){
			count++;
		}
	}
	public int getCount()
	{
		synchronized(lock){
			return count;
		}
	}
}
class CounterThreadObjectLevel extends Thread
{
	CounterObjectLevel c1;
	public CounterThreadObjectLevel(CounterObjectLevel c1){
		this.c1=c1;
	}
	public void run(){
		for(int i=0;i<100;i++){
			c1.increment();
		}
	}
}

class As72ATest 
{
	public static void main(String arg[]) throws InterruptedException
	{
		CounterObjectLevel c1=new CounterObjectLevel();
		CounterThreadObjectLevel t1=new CounterThreadObjectLevel(c1);
		CounterThreadObjectLevel t2=new CounterThreadObjectLevel(c1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final count: " + c1.getCount());
	}
}
		
	
	