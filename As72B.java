// q-2 (B)
class CounterClassLevelSync                            // Class-Level Synchronization
{
	static int count=0;
	public void increment()
	{
		synchronized(CounterClassLevelSync.class){
			count++;
		}
	}
	public int getCount()
	{
		synchronized(CounterClassLevelSync.class){
			return count;
		}
	}
}
class CounterThreadClassLevelSync extends Thread
{
	CounterClassLevelSync c1;
	public CounterThreadClassLevelSync(CounterClassLevelSync c1){
		this.c1=c1;
	}
	public void run(){
		for(int i=0;i<100;i++){
			c1.increment();
		}
	}
}

class As72BTest 
{
	public static void main(String arg[]) throws InterruptedException
	{
		CounterClassLevelSync c1=new CounterClassLevelSync();
		CounterClassLevelSync c2=new CounterClassLevelSync();
		CounterThreadClassLevelSync t1=new CounterThreadClassLevelSync(c1);
		CounterThreadClassLevelSync t2=new CounterThreadClassLevelSync(c2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final count: " + c1.getCount());
		System.out.println("Final count: " + c2.getCount());
	}
}