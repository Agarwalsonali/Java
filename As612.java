// q-1(B)
class Myrunnable implements Runnable
{
	public void run(){
		for(int i=0;i<100;i++)
			System.out.println("From the myrunnable class");
	}
}
class As612TestThread
{
	public static void main(String arg[]){
		Myrunnable r1=new Myrunnable();
        Thread t1=new Thread(r1);
        t1.start();
        for(int i=0;i<100;i++)
            System.out.println("From the main class");
	}
}	