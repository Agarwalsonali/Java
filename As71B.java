// q-1 (B)
class CounterClassLevel                             // Class-Level Synchronization
{
	static int count=0;
	synchronized public static void increment()
	{
		count++;
	}
		
	synchronized public static int getCount()
	{
		return count;
	}
}
class CounterThreadClassLevel extends Thread
{
	public void run(){
		for(int i=0;i<1000;i++){
			CounterClassLevel.increment();
		}
	}
}

class As71BTest
{
	public static void main(String arg[]) throws InterruptedException
	{
		CounterThreadClassLevel t1=new CounterThreadClassLevel();
		CounterThreadClassLevel t2=new CounterThreadClassLevel();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final count: " + CounterClassLevel.getCount());
	}
}