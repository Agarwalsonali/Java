// q-3
class mythread extends Thread
{
	public mythread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName() + ": Count " + i);
			if(i==3 && Thread.currentThread().getName().equals("Thread-1")){
				System.out.println(Thread.currentThread().getName() + ": yielding control");
				Thread.yield();
			}
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
class As63Test
{
	public static void main(String ar[]){
		mythread t1=new mythread("Thread-1");
		mythread t2=new mythread("Thread-2");
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			System.out.println("Thread-1 joined");
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Main thread finished");
	}
}
			