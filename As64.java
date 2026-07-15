// q-4
class mythread2 extends Thread
{
	public mythread2(String name){
		super(name);
	}
	public void run(){
		System.out.println("Thread " +getName() + " with priority " + getPriority() + " is running.");
	}
}
class As64Test
{
	public static void main(String ar[]){
		mythread2 t1=new mythread2("Thread-1");
		mythread2 t2=new mythread2("Thread-2");
		
		t1.setPriority(Thread.MIN_PRIORITY); // Set priority to 1
		t2.setPriority(Thread.MAX_PRIORITY); // Set priority to 10
		
		System.out.println("Thread 1 name: " + t1.getName());
		System.out.println("Thread 2 name: " + t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("New-Thread-1");
		System.out.println("Thread 1 new name: " + t1.getName());
	}
}
		